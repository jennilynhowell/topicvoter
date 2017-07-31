package com.jennilyn.repositories;

import com.jennilyn.interfaces.TopicRepository;
import com.jennilyn.models.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class TopicRepositoryImpl implements TopicRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Topic> findAll(){
        return jdbcTemplate.query("SELECT * FROM topic", new TopicMapper());
    }

    private static class TopicMapper implements RowMapper<Topic> {
        @Override
        public Topic mapRow(ResultSet resultSet, int i) throws SQLException {
            Topic topic = new Topic(resultSet.getInt("id"),
                                    resultSet.getString("title"),
                                    resultSet.getString("description"));
            return topic;
        }
    }
}

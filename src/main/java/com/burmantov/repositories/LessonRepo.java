package com.burmantov.repositories;

import com.burmantov.models.Lesson;
import org.springframework.data.repository.CrudRepository;

public interface LessonRepo extends CrudRepository<Lesson, Long> {
}

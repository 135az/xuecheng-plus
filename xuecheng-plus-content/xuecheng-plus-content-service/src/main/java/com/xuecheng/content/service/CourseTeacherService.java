package com.xuecheng.content.service;

import com.xuecheng.content.model.po.CourseTeacher;

import java.util.List;

public interface CourseTeacherService {
    /**
     * 查询教师信息
     *
     * @param courseId
     * @return
     */
    List<CourseTeacher> getCourseTeacherList(Long courseId);

    /**
     * 添加/修改教师信息
     *
     * @param courseTeacher
     * @return
     */
    CourseTeacher saveCourseTeacher(CourseTeacher courseTeacher);

    /**
     * 删除教师信息
     *
     * @param courseId
     * @param teacherId
     */
    void deleteCourseTeacher(Long courseId, Long teacherId);
}

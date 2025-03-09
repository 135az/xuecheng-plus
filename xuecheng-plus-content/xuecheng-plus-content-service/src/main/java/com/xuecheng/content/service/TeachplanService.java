package com.xuecheng.content.service;

import com.xuecheng.content.model.dto.SaveTeachplanDto;
import com.xuecheng.content.model.dto.TeachplanDto;

import java.util.List;

/**
 * @author Mr.M
 * @version 1.0
 * @description 课程基本信息管理业务接口
 * @date 2022/9/6 21:42
 */
public interface TeachplanService {

    /**
     * @param courseId 课程id
     * @return List<TeachplanDto>
     * @description 查询课程计划树型结构
     * @author Mr.M
     * @date 2022/9/9 11:13
     */
    List<TeachplanDto> findTeachplanTree(long courseId);

    /**
     * @param teachplanDto 课程计划信息
     * @return void
     * @description 保存课程计划
     * @author Mr.M
     * @date 2022/9/9 13:39
     */
    void saveTeachplan(SaveTeachplanDto teachplanDto);

    /**
     * @param teachplanId
     * @description 删除课程计划
     */
    void deleteTeachplan(Long teachplanId);

    /***
     *
     * @param moveType 移动类型
     * @param teachplanId
     * @description 课程计划排序
     */
    void orderByTeachplan(String moveType, Long teachplanId);

}

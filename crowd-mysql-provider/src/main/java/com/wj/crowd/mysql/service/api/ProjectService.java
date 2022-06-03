package com.wj.crowd.mysql.service.api;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wj.crowd.entity.Do.Project;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wj.crowd.entity.Do.SimpleProject;
import com.wj.crowd.entity.Vo.project.SearchProjectVo;
import com.wj.crowd.entity.Vo.project.UpdateProjectVo;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author w
 * @since 2022-05-05
 */
public interface ProjectService extends IService<Project> {

    void saveProject(Project project);

    Page<SimpleProject> getProjectPages(Long page, Long size, SearchProjectVo searchProjectVo);

    Project getProjectByProjectId(String projectId);

    void modifyProjectRemote(UpdateProjectVo updateProjectVo);

    List<Project> getProjectByUserId(String uid);

    void removeProjectById(String projectId);

    void modifyProjectSupporter(String supportId, Project project);

    Map<String, Object> getUserSimpleProjectInfo(String uid);
}

/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.sample2.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wavemaker.commons.wrapper.StringWrapper;
import com.wavemaker.runtime.data.export.DataExportOptions;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.manager.ExportedFileManager;
import com.wavemaker.runtime.file.model.Downloadable;
import com.wavemaker.runtime.security.xss.XssDisable;
import com.wavemaker.tools.api.core.annotations.MapTo;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

import com.testingallprocedurescenarios.sample2.Projact;
import com.testingallprocedurescenarios.sample2.Project;
import com.testingallprocedurescenarios.sample2.service.ProjectService;


/**
 * Controller object for domain model class Project.
 * @see Project
 */
@RestController("SAMPLE2.ProjectController")
@Api(value = "ProjectController", description = "Exposes APIs to work with Project resource.")
@RequestMapping("/SAMPLE2/Project")
public class ProjectController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProjectController.class);

    @Autowired
	@Qualifier("SAMPLE2.ProjectService")
	private ProjectService projectService;

	@Autowired
	private ExportedFileManager exportedFileManager;

	@ApiOperation(value = "Creates a new Project instance.")
    @RequestMapping(method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Project createProject(@RequestBody Project project) {
		LOGGER.debug("Create Project with information: {}" , project);

		project = projectService.create(project);
		LOGGER.debug("Created Project with information: {}" , project);

	    return project;
	}

    @ApiOperation(value = "Returns the Project instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Project getProject(@PathVariable("id") String id) {
        LOGGER.debug("Getting Project with id: {}" , id);

        Project foundProject = projectService.getById(id);
        LOGGER.debug("Project details with id: {}" , foundProject);

        return foundProject;
    }

    @ApiOperation(value = "Updates the Project instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Project editProject(@PathVariable("id") String id, @RequestBody Project project) {
        LOGGER.debug("Editing Project with id: {}" , project.getProjno());

        project.setProjno(id);
        project = projectService.update(project);
        LOGGER.debug("Project details with id: {}" , project);

        return project;
    }
    
    @ApiOperation(value = "Partially updates the Project instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PATCH)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Project patchProject(@PathVariable("id") String id, @RequestBody @MapTo(Project.class) Map<String, Object> projectPatch) {
        LOGGER.debug("Partially updating Project with id: {}" , id);

        Project project = projectService.partialUpdate(id, projectPatch);
        LOGGER.debug("Project details after partial update: {}" , project);

        return project;
    }

    @ApiOperation(value = "Deletes the Project instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deleteProject(@PathVariable("id") String id) {
        LOGGER.debug("Deleting Project with id: {}" , id);

        Project deletedProject = projectService.delete(id);

        return deletedProject != null;
    }

    /**
     * @deprecated Use {@link #findProjects(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of Project instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @XssDisable
    public Page<Project> searchProjectsByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering Projects list by query filter:{}", (Object) queryFilters);
        return projectService.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Project instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Project> findProjects(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Projects list by filter:", query);
        return projectService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Project instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/filter", method = RequestMethod.POST, consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @XssDisable
    public Page<Project> filterProjects(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Projects list by filter", query);
        return projectService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/export/{exportType}", method = {RequestMethod.GET,  RequestMethod.POST}, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @XssDisable
    public Downloadable exportProjects(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return projectService.export(exportType, query, pageable);
    }

    @ApiOperation(value = "Returns a URL to download a file for the data matching the optional query (q) request param and the required fields provided in the Export Options.") 
    @RequestMapping(value = "/export", method = {RequestMethod.POST}, consumes = "application/json")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @XssDisable
    public StringWrapper exportProjectsAndGetURL(@RequestBody DataExportOptions exportOptions, Pageable pageable) {
        String exportedFileName = exportOptions.getFileName();
        if(exportedFileName == null || exportedFileName.isEmpty()) {
            exportedFileName = Project.class.getSimpleName();
        }
        exportedFileName += exportOptions.getExportType().getExtension();
        String exportedUrl = exportedFileManager.registerAndGetURL(exportedFileName, outputStream -> projectService.export(exportOptions, pageable, outputStream));
        return new StringWrapper(exportedUrl);
    }

	@ApiOperation(value = "Returns the total count of Project instances matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
	@RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	@XssDisable
	public Long countProjects( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting Projects");
		return projectService.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@RequestMapping(value = "/aggregations", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	@XssDisable
	public Page<Map<String, Object>> getProjectAggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return projectService.getAggregatedValues(aggregationInfo, pageable);
    }

    @RequestMapping(value="/{id:.+}/projacts", method=RequestMethod.GET)
    @ApiOperation(value = "Gets the projacts instance associated with the given id.")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Projact> findAssociatedProjacts(@PathVariable("id") String id, Pageable pageable) {

        LOGGER.debug("Fetching all associated projacts");
        return projectService.findAssociatedProjacts(id, pageable);
    }

    @RequestMapping(value="/{id:.+}/projectsForMajproj", method=RequestMethod.GET)
    @ApiOperation(value = "Gets the projectsForMajproj instance associated with the given id.")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Project> findAssociatedProjectsForMajproj(@PathVariable("id") String id, Pageable pageable) {

        LOGGER.debug("Fetching all associated projectsForMajproj");
        return projectService.findAssociatedProjectsForMajproj(id, pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service ProjectService instance
	 */
	protected void setProjectService(ProjectService service) {
		this.projectService = service;
	}

}
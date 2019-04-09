/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.sample2.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.DataExportOptions;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.model.Downloadable;

import com.testingallprocedurescenarios.sample2.Projact;
import com.testingallprocedurescenarios.sample2.Project;

/**
 * Service object for domain model class {@link Project}.
 */
public interface ProjectService {

    /**
     * Creates a new Project. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Project if any.
     *
     * @param project Details of the Project to be created; value cannot be null.
     * @return The newly created Project.
     */
    Project create(@Valid Project project);


	/**
     * Returns Project by given id if exists.
     *
     * @param projectId The id of the Project to get; value cannot be null.
     * @return Project associated with the given projectId.
	 * @throws EntityNotFoundException If no Project is found.
     */
    Project getById(String projectId);

    /**
     * Find and return the Project by given id if exists, returns null otherwise.
     *
     * @param projectId The id of the Project to get; value cannot be null.
     * @return Project associated with the given projectId.
     */
    Project findById(String projectId);

	/**
     * Find and return the list of Projects by given id's.
     *
     * If orderedReturn true, the return List is ordered and positional relative to the incoming ids.
     *
     * In case of unknown entities:
     *
     * If enabled, A null is inserted into the List at the proper position(s).
     * If disabled, the nulls are not put into the return List.
     *
     * @param projectIds The id's of the Project to get; value cannot be null.
     * @param orderedReturn Should the return List be ordered and positional in relation to the incoming ids?
     * @return Projects associated with the given projectIds.
     */
    List<Project> findByMultipleIds(List<String> projectIds, boolean orderedReturn);


    /**
     * Updates the details of an existing Project. It replaces all fields of the existing Project with the given project.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Project if any.
     *
     * @param project The details of the Project to be updated; value cannot be null.
     * @return The updated Project.
     * @throws EntityNotFoundException if no Project is found with given input.
     */
    Project update(@Valid Project project);

    /**
     * Deletes an existing Project with the given id.
     *
     * @param projectId The id of the Project to be deleted; value cannot be null.
     * @return The deleted Project.
     * @throws EntityNotFoundException if no Project found with the given id.
     */
    Project delete(String projectId);

    /**
     * Deletes an existing Project with the given object.
     *
     * @param project The instance of the Project to be deleted; value cannot be null.
     */
    void delete(Project project);

    /**
     * Find all Projects matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
     *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
     *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Projects.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
     */
    @Deprecated
    Page<Project> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
     * Find all Projects matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Projects.
     *
     * @see Pageable
     * @see Page
     */
    Page<Project> findAll(String query, Pageable pageable);

    /**
     * Exports all Projects matching the given input query to the given exportType format.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param exportType The format in which to export the data; value cannot be null.
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @return The Downloadable file in given export type.
     *
     * @see Pageable
     * @see ExportType
     * @see Downloadable
     */
    Downloadable export(ExportType exportType, String query, Pageable pageable);

    /**
     * Exports all Projects matching the given input query to the given exportType format.
     *
     * @param options The export options provided by the user; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @param outputStream The output stream of the file for the exported data to be written to.
     *
     * @see DataExportOptions
     * @see Pageable
     * @see OutputStream
     */
    void export(DataExportOptions options, Pageable pageable, OutputStream outputStream);

    /**
     * Retrieve the count of the Projects in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
     * @return The count of the Project.
     */
    long count(String query);

    /**
     * Retrieve aggregated values with matching aggregation info.
     *
     * @param aggregationInfo info related to aggregations.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @return Paginated data with included fields.
     *
     * @see AggregationInfo
     * @see Pageable
     * @see Page
	 */
    Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable);

    /*
     * Returns the associated projacts for given Project id.
     *
     * @param projno value of projno; value cannot be null
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of associated Projact instances.
     *
     * @see Pageable
     * @see Page
     */
    Page<Projact> findAssociatedProjacts(String projno, Pageable pageable);

    /*
     * Returns the associated projectsForMajproj for given Project id.
     *
     * @param projno value of projno; value cannot be null
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of associated Project instances.
     *
     * @see Pageable
     * @see Page
     */
    Page<Project> findAssociatedProjectsForMajproj(String projno, Pageable pageable);

}
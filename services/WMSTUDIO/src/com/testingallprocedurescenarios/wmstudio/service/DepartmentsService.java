/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.wmstudio.service;

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

import com.testingallprocedurescenarios.wmstudio.Departments;
import com.testingallprocedurescenarios.wmstudio.Employees;
import com.testingallprocedurescenarios.wmstudio.JobHistory;

/**
 * Service object for domain model class {@link Departments}.
 */
public interface DepartmentsService {

    /**
     * Creates a new Departments. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Departments if any.
     *
     * @param departments Details of the Departments to be created; value cannot be null.
     * @return The newly created Departments.
     */
    Departments create(@Valid Departments departments);


	/**
     * Returns Departments by given id if exists.
     *
     * @param departmentsId The id of the Departments to get; value cannot be null.
     * @return Departments associated with the given departmentsId.
	 * @throws EntityNotFoundException If no Departments is found.
     */
    Departments getById(Short departmentsId);

    /**
     * Find and return the Departments by given id if exists, returns null otherwise.
     *
     * @param departmentsId The id of the Departments to get; value cannot be null.
     * @return Departments associated with the given departmentsId.
     */
    Departments findById(Short departmentsId);

	/**
     * Find and return the list of Departments by given id's.
     *
     * If orderedReturn true, the return List is ordered and positional relative to the incoming ids.
     *
     * In case of unknown entities:
     *
     * If enabled, A null is inserted into the List at the proper position(s).
     * If disabled, the nulls are not put into the return List.
     *
     * @param departmentsIds The id's of the Departments to get; value cannot be null.
     * @param orderedReturn Should the return List be ordered and positional in relation to the incoming ids?
     * @return Departments associated with the given departmentsIds.
     */
    List<Departments> findByMultipleIds(List<Short> departmentsIds, boolean orderedReturn);


    /**
     * Updates the details of an existing Departments. It replaces all fields of the existing Departments with the given departments.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Departments if any.
     *
     * @param departments The details of the Departments to be updated; value cannot be null.
     * @return The updated Departments.
     * @throws EntityNotFoundException if no Departments is found with given input.
     */
    Departments update(@Valid Departments departments);


    /**
     * Partially updates the details of an existing Departments. It updates only the
     * fields of the existing Departments which are passed in the departmentsPatch.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Departments if any.
     *
     * @param departmentsId The id of the Departments to be deleted; value cannot be null.
     * @param departmentsPatch The partial data of Departments which is supposed to be updated; value cannot be null.
     * @return The updated Departments.
     * @throws EntityNotFoundException if no Departments is found with given input.
     */
    Departments partialUpdate(Short departmentsId, Map<String, Object> departmentsPatch);

    /**
     * Deletes an existing Departments with the given id.
     *
     * @param departmentsId The id of the Departments to be deleted; value cannot be null.
     * @return The deleted Departments.
     * @throws EntityNotFoundException if no Departments found with the given id.
     */
    Departments delete(Short departmentsId);

    /**
     * Deletes an existing Departments with the given object.
     *
     * @param departments The instance of the Departments to be deleted; value cannot be null.
     */
    void delete(Departments departments);

    /**
     * Find all Departments matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
     *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
     *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Departments.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
     */
    @Deprecated
    Page<Departments> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
     * Find all Departments matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Departments.
     *
     * @see Pageable
     * @see Page
     */
    Page<Departments> findAll(String query, Pageable pageable);

    /**
     * Exports all Departments matching the given input query to the given exportType format.
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
     * Exports all Departments matching the given input query to the given exportType format.
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
     * Retrieve the count of the Departments in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
     * @return The count of the Departments.
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
     * Returns the associated employeesesForDepartmentId for given Departments id.
     *
     * @param departmentId value of departmentId; value cannot be null
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of associated Employees instances.
     *
     * @see Pageable
     * @see Page
     */
    Page<Employees> findAssociatedEmployeesesForDepartmentId(Short departmentId, Pageable pageable);

    /*
     * Returns the associated jobHistories for given Departments id.
     *
     * @param departmentId value of departmentId; value cannot be null
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of associated JobHistory instances.
     *
     * @see Pageable
     * @see Page
     */
    Page<JobHistory> findAssociatedJobHistories(Short departmentId, Pageable pageable);

}
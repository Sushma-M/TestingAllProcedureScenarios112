/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.adventureworks2014.service;

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

import com.testingallprocedurescenarios.adventureworks2014.EmployeeDepartmentHistory;
import com.testingallprocedurescenarios.adventureworks2014.EmployeeDepartmentHistoryId;

/**
 * Service object for domain model class {@link EmployeeDepartmentHistory}.
 */
public interface EmployeeDepartmentHistoryService {

    /**
     * Creates a new EmployeeDepartmentHistory. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on EmployeeDepartmentHistory if any.
     *
     * @param employeeDepartmentHistory Details of the EmployeeDepartmentHistory to be created; value cannot be null.
     * @return The newly created EmployeeDepartmentHistory.
     */
    EmployeeDepartmentHistory create(@Valid EmployeeDepartmentHistory employeeDepartmentHistory);


	/**
     * Returns EmployeeDepartmentHistory by given id if exists.
     *
     * @param employeedepartmenthistoryId The id of the EmployeeDepartmentHistory to get; value cannot be null.
     * @return EmployeeDepartmentHistory associated with the given employeedepartmenthistoryId.
	 * @throws EntityNotFoundException If no EmployeeDepartmentHistory is found.
     */
    EmployeeDepartmentHistory getById(EmployeeDepartmentHistoryId employeedepartmenthistoryId);

    /**
     * Find and return the EmployeeDepartmentHistory by given id if exists, returns null otherwise.
     *
     * @param employeedepartmenthistoryId The id of the EmployeeDepartmentHistory to get; value cannot be null.
     * @return EmployeeDepartmentHistory associated with the given employeedepartmenthistoryId.
     */
    EmployeeDepartmentHistory findById(EmployeeDepartmentHistoryId employeedepartmenthistoryId);

	/**
     * Find and return the list of EmployeeDepartmentHistories by given id's.
     *
     * If orderedReturn true, the return List is ordered and positional relative to the incoming ids.
     *
     * In case of unknown entities:
     *
     * If enabled, A null is inserted into the List at the proper position(s).
     * If disabled, the nulls are not put into the return List.
     *
     * @param employeedepartmenthistoryIds The id's of the EmployeeDepartmentHistory to get; value cannot be null.
     * @param orderedReturn Should the return List be ordered and positional in relation to the incoming ids?
     * @return EmployeeDepartmentHistories associated with the given employeedepartmenthistoryIds.
     */
    List<EmployeeDepartmentHistory> findByMultipleIds(List<EmployeeDepartmentHistoryId> employeedepartmenthistoryIds, boolean orderedReturn);


    /**
     * Updates the details of an existing EmployeeDepartmentHistory. It replaces all fields of the existing EmployeeDepartmentHistory with the given employeeDepartmentHistory.
     *
     * This method overrides the input field values using Server side or database managed properties defined on EmployeeDepartmentHistory if any.
     *
     * @param employeeDepartmentHistory The details of the EmployeeDepartmentHistory to be updated; value cannot be null.
     * @return The updated EmployeeDepartmentHistory.
     * @throws EntityNotFoundException if no EmployeeDepartmentHistory is found with given input.
     */
    EmployeeDepartmentHistory update(@Valid EmployeeDepartmentHistory employeeDepartmentHistory);

    /**
     * Deletes an existing EmployeeDepartmentHistory with the given id.
     *
     * @param employeedepartmenthistoryId The id of the EmployeeDepartmentHistory to be deleted; value cannot be null.
     * @return The deleted EmployeeDepartmentHistory.
     * @throws EntityNotFoundException if no EmployeeDepartmentHistory found with the given id.
     */
    EmployeeDepartmentHistory delete(EmployeeDepartmentHistoryId employeedepartmenthistoryId);

    /**
     * Deletes an existing EmployeeDepartmentHistory with the given object.
     *
     * @param employeeDepartmentHistory The instance of the EmployeeDepartmentHistory to be deleted; value cannot be null.
     */
    void delete(EmployeeDepartmentHistory employeeDepartmentHistory);

    /**
     * Find all EmployeeDepartmentHistories matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
     *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
     *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching EmployeeDepartmentHistories.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
     */
    @Deprecated
    Page<EmployeeDepartmentHistory> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
     * Find all EmployeeDepartmentHistories matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching EmployeeDepartmentHistories.
     *
     * @see Pageable
     * @see Page
     */
    Page<EmployeeDepartmentHistory> findAll(String query, Pageable pageable);

    /**
     * Exports all EmployeeDepartmentHistories matching the given input query to the given exportType format.
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
     * Exports all EmployeeDepartmentHistories matching the given input query to the given exportType format.
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
     * Retrieve the count of the EmployeeDepartmentHistories in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
     * @return The count of the EmployeeDepartmentHistory.
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


}
/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.dbscenarios.service;

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

import com.testingallprocedurescenarios.dbscenarios.Table6;

/**
 * Service object for domain model class {@link Table6}.
 */
public interface Table6Service {

    /**
     * Creates a new Table6. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Table6 if any.
     *
     * @param table6 Details of the Table6 to be created; value cannot be null.
     * @return The newly created Table6.
     */
    Table6 create(@Valid Table6 table6);


	/**
     * Returns Table6 by given id if exists.
     *
     * @param table6Id The id of the Table6 to get; value cannot be null.
     * @return Table6 associated with the given table6Id.
	 * @throws EntityNotFoundException If no Table6 is found.
     */
    Table6 getById(Long table6Id);

    /**
     * Find and return the Table6 by given id if exists, returns null otherwise.
     *
     * @param table6Id The id of the Table6 to get; value cannot be null.
     * @return Table6 associated with the given table6Id.
     */
    Table6 findById(Long table6Id);

	/**
     * Find and return the list of Table6s by given id's.
     *
     * If orderedReturn true, the return List is ordered and positional relative to the incoming ids.
     *
     * In case of unknown entities:
     *
     * If enabled, A null is inserted into the List at the proper position(s).
     * If disabled, the nulls are not put into the return List.
     *
     * @param table6Ids The id's of the Table6 to get; value cannot be null.
     * @param orderedReturn Should the return List be ordered and positional in relation to the incoming ids?
     * @return Table6s associated with the given table6Ids.
     */
    List<Table6> findByMultipleIds(List<Long> table6Ids, boolean orderedReturn);


    /**
     * Updates the details of an existing Table6. It replaces all fields of the existing Table6 with the given table6.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Table6 if any.
     *
     * @param table6 The details of the Table6 to be updated; value cannot be null.
     * @return The updated Table6.
     * @throws EntityNotFoundException if no Table6 is found with given input.
     */
    Table6 update(@Valid Table6 table6);


    /**
     * Partially updates the details of an existing Table6. It updates only the
     * fields of the existing Table6 which are passed in the table6Patch.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Table6 if any.
     *
     * @param table6Id The id of the Table6 to be deleted; value cannot be null.
     * @param table6Patch The partial data of Table6 which is supposed to be updated; value cannot be null.
     * @return The updated Table6.
     * @throws EntityNotFoundException if no Table6 is found with given input.
     */
    Table6 partialUpdate(Long table6Id, Map<String, Object> table6Patch);

    /**
     * Deletes an existing Table6 with the given id.
     *
     * @param table6Id The id of the Table6 to be deleted; value cannot be null.
     * @return The deleted Table6.
     * @throws EntityNotFoundException if no Table6 found with the given id.
     */
    Table6 delete(Long table6Id);

    /**
     * Deletes an existing Table6 with the given object.
     *
     * @param table6 The instance of the Table6 to be deleted; value cannot be null.
     */
    void delete(Table6 table6);

    /**
     * Find all Table6s matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
     *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
     *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Table6s.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
     */
    @Deprecated
    Page<Table6> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
     * Find all Table6s matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Table6s.
     *
     * @see Pageable
     * @see Page
     */
    Page<Table6> findAll(String query, Pageable pageable);

    /**
     * Exports all Table6s matching the given input query to the given exportType format.
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
     * Exports all Table6s matching the given input query to the given exportType format.
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
     * Retrieve the count of the Table6s in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
     * @return The count of the Table6.
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
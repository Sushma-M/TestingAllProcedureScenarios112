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

import com.testingallprocedurescenarios.dbscenarios.DbtYpes;

/**
 * Service object for domain model class {@link DbtYpes}.
 */
public interface DbtYpesService {

    /**
     * Creates a new DbtYpes. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on DbtYpes if any.
     *
     * @param dbtYpes Details of the DbtYpes to be created; value cannot be null.
     * @return The newly created DbtYpes.
     */
    DbtYpes create(@Valid DbtYpes dbtYpes);


	/**
     * Returns DbtYpes by given id if exists.
     *
     * @param dbtypesId The id of the DbtYpes to get; value cannot be null.
     * @return DbtYpes associated with the given dbtypesId.
	 * @throws EntityNotFoundException If no DbtYpes is found.
     */
    DbtYpes getById(Integer dbtypesId);

    /**
     * Find and return the DbtYpes by given id if exists, returns null otherwise.
     *
     * @param dbtypesId The id of the DbtYpes to get; value cannot be null.
     * @return DbtYpes associated with the given dbtypesId.
     */
    DbtYpes findById(Integer dbtypesId);

	/**
     * Find and return the list of DbtYpes by given id's.
     *
     * If orderedReturn true, the return List is ordered and positional relative to the incoming ids.
     *
     * In case of unknown entities:
     *
     * If enabled, A null is inserted into the List at the proper position(s).
     * If disabled, the nulls are not put into the return List.
     *
     * @param dbtypesIds The id's of the DbtYpes to get; value cannot be null.
     * @param orderedReturn Should the return List be ordered and positional in relation to the incoming ids?
     * @return DbtYpes associated with the given dbtypesIds.
     */
    List<DbtYpes> findByMultipleIds(List<Integer> dbtypesIds, boolean orderedReturn);


    /**
     * Updates the details of an existing DbtYpes. It replaces all fields of the existing DbtYpes with the given dbtYpes.
     *
     * This method overrides the input field values using Server side or database managed properties defined on DbtYpes if any.
     *
     * @param dbtYpes The details of the DbtYpes to be updated; value cannot be null.
     * @return The updated DbtYpes.
     * @throws EntityNotFoundException if no DbtYpes is found with given input.
     */
    DbtYpes update(@Valid DbtYpes dbtYpes);

    /**
     * Deletes an existing DbtYpes with the given id.
     *
     * @param dbtypesId The id of the DbtYpes to be deleted; value cannot be null.
     * @return The deleted DbtYpes.
     * @throws EntityNotFoundException if no DbtYpes found with the given id.
     */
    DbtYpes delete(Integer dbtypesId);

    /**
     * Deletes an existing DbtYpes with the given object.
     *
     * @param dbtYpes The instance of the DbtYpes to be deleted; value cannot be null.
     */
    void delete(DbtYpes dbtYpes);

    /**
     * Find all DbtYpes matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
     *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
     *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching DbtYpes.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
     */
    @Deprecated
    Page<DbtYpes> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
     * Find all DbtYpes matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching DbtYpes.
     *
     * @see Pageable
     * @see Page
     */
    Page<DbtYpes> findAll(String query, Pageable pageable);

    /**
     * Exports all DbtYpes matching the given input query to the given exportType format.
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
     * Exports all DbtYpes matching the given input query to the given exportType format.
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
     * Retrieve the count of the DbtYpes in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
     * @return The count of the DbtYpes.
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
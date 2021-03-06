/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.db123__.service;

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

import com.testingallprocedurescenarios.db123__.TcOne2one;

/**
 * Service object for domain model class {@link TcOne2one}.
 */
public interface TcOne2oneService {

    /**
     * Creates a new TcOne2one. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on TcOne2one if any.
     *
     * @param tcOne2one Details of the TcOne2one to be created; value cannot be null.
     * @return The newly created TcOne2one.
     */
    TcOne2one create(@Valid TcOne2one tcOne2one);


	/**
     * Returns TcOne2one by given id if exists.
     *
     * @param tcone2oneId The id of the TcOne2one to get; value cannot be null.
     * @return TcOne2one associated with the given tcone2oneId.
	 * @throws EntityNotFoundException If no TcOne2one is found.
     */
    TcOne2one getById(String tcone2oneId);

    /**
     * Find and return the TcOne2one by given id if exists, returns null otherwise.
     *
     * @param tcone2oneId The id of the TcOne2one to get; value cannot be null.
     * @return TcOne2one associated with the given tcone2oneId.
     */
    TcOne2one findById(String tcone2oneId);

	/**
     * Find and return the list of TcOne2ones by given id's.
     *
     * If orderedReturn true, the return List is ordered and positional relative to the incoming ids.
     *
     * In case of unknown entities:
     *
     * If enabled, A null is inserted into the List at the proper position(s).
     * If disabled, the nulls are not put into the return List.
     *
     * @param tcone2oneIds The id's of the TcOne2one to get; value cannot be null.
     * @param orderedReturn Should the return List be ordered and positional in relation to the incoming ids?
     * @return TcOne2ones associated with the given tcone2oneIds.
     */
    List<TcOne2one> findByMultipleIds(List<String> tcone2oneIds, boolean orderedReturn);


    /**
     * Updates the details of an existing TcOne2one. It replaces all fields of the existing TcOne2one with the given tcOne2one.
     *
     * This method overrides the input field values using Server side or database managed properties defined on TcOne2one if any.
     *
     * @param tcOne2one The details of the TcOne2one to be updated; value cannot be null.
     * @return The updated TcOne2one.
     * @throws EntityNotFoundException if no TcOne2one is found with given input.
     */
    TcOne2one update(@Valid TcOne2one tcOne2one);

    /**
     * Deletes an existing TcOne2one with the given id.
     *
     * @param tcone2oneId The id of the TcOne2one to be deleted; value cannot be null.
     * @return The deleted TcOne2one.
     * @throws EntityNotFoundException if no TcOne2one found with the given id.
     */
    TcOne2one delete(String tcone2oneId);

    /**
     * Deletes an existing TcOne2one with the given object.
     *
     * @param tcOne2one The instance of the TcOne2one to be deleted; value cannot be null.
     */
    void delete(TcOne2one tcOne2one);

    /**
     * Find all TcOne2ones matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
     *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
     *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching TcOne2ones.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
     */
    @Deprecated
    Page<TcOne2one> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
     * Find all TcOne2ones matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching TcOne2ones.
     *
     * @see Pageable
     * @see Page
     */
    Page<TcOne2one> findAll(String query, Pageable pageable);

    /**
     * Exports all TcOne2ones matching the given input query to the given exportType format.
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
     * Exports all TcOne2ones matching the given input query to the given exportType format.
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
     * Retrieve the count of the TcOne2ones in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
     * @return The count of the TcOne2one.
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
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

import com.testingallprocedurescenarios.sample2.Vempprojact;
import com.testingallprocedurescenarios.sample2.VempprojactId;

/**
 * Service object for domain model class {@link Vempprojact}.
 */
public interface VempprojactService {

    /**
     * Creates a new Vempprojact. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Vempprojact if any.
     *
     * @param vempprojact Details of the Vempprojact to be created; value cannot be null.
     * @return The newly created Vempprojact.
     */
    Vempprojact create(@Valid Vempprojact vempprojact);


	/**
     * Returns Vempprojact by given id if exists.
     *
     * @param vempprojactId The id of the Vempprojact to get; value cannot be null.
     * @return Vempprojact associated with the given vempprojactId.
	 * @throws EntityNotFoundException If no Vempprojact is found.
     */
    Vempprojact getById(VempprojactId vempprojactId);

    /**
     * Find and return the Vempprojact by given id if exists, returns null otherwise.
     *
     * @param vempprojactId The id of the Vempprojact to get; value cannot be null.
     * @return Vempprojact associated with the given vempprojactId.
     */
    Vempprojact findById(VempprojactId vempprojactId);

	/**
     * Find and return the list of Vempprojacts by given id's.
     *
     * If orderedReturn true, the return List is ordered and positional relative to the incoming ids.
     *
     * In case of unknown entities:
     *
     * If enabled, A null is inserted into the List at the proper position(s).
     * If disabled, the nulls are not put into the return List.
     *
     * @param vempprojactIds The id's of the Vempprojact to get; value cannot be null.
     * @param orderedReturn Should the return List be ordered and positional in relation to the incoming ids?
     * @return Vempprojacts associated with the given vempprojactIds.
     */
    List<Vempprojact> findByMultipleIds(List<VempprojactId> vempprojactIds, boolean orderedReturn);


    /**
     * Updates the details of an existing Vempprojact. It replaces all fields of the existing Vempprojact with the given vempprojact.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Vempprojact if any.
     *
     * @param vempprojact The details of the Vempprojact to be updated; value cannot be null.
     * @return The updated Vempprojact.
     * @throws EntityNotFoundException if no Vempprojact is found with given input.
     */
    Vempprojact update(@Valid Vempprojact vempprojact);


    /**
     * Partially updates the details of an existing Vempprojact. It updates only the
     * fields of the existing Vempprojact which are passed in the vempprojactPatch.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Vempprojact if any.
     *
     * @param vempprojactId The id of the Vempprojact to be deleted; value cannot be null.
     * @param vempprojactPatch The partial data of Vempprojact which is supposed to be updated; value cannot be null.
     * @return The updated Vempprojact.
     * @throws EntityNotFoundException if no Vempprojact is found with given input.
     */
    Vempprojact partialUpdate(VempprojactId vempprojactId, Map<String, Object> vempprojactPatch);

    /**
     * Deletes an existing Vempprojact with the given id.
     *
     * @param vempprojactId The id of the Vempprojact to be deleted; value cannot be null.
     * @return The deleted Vempprojact.
     * @throws EntityNotFoundException if no Vempprojact found with the given id.
     */
    Vempprojact delete(VempprojactId vempprojactId);

    /**
     * Deletes an existing Vempprojact with the given object.
     *
     * @param vempprojact The instance of the Vempprojact to be deleted; value cannot be null.
     */
    void delete(Vempprojact vempprojact);

    /**
     * Find all Vempprojacts matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
     *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
     *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Vempprojacts.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
     */
    @Deprecated
    Page<Vempprojact> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
     * Find all Vempprojacts matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Vempprojacts.
     *
     * @see Pageable
     * @see Page
     */
    Page<Vempprojact> findAll(String query, Pageable pageable);

    /**
     * Exports all Vempprojacts matching the given input query to the given exportType format.
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
     * Exports all Vempprojacts matching the given input query to the given exportType format.
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
     * Retrieve the count of the Vempprojacts in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
     * @return The count of the Vempprojact.
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
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

import com.testingallprocedurescenarios.sample2.Vdept;
import com.testingallprocedurescenarios.sample2.VdeptId;

/**
 * Service object for domain model class {@link Vdept}.
 */
public interface VdeptService {

    /**
     * Creates a new Vdept. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Vdept if any.
     *
     * @param vdept Details of the Vdept to be created; value cannot be null.
     * @return The newly created Vdept.
     */
    Vdept create(@Valid Vdept vdept);


	/**
     * Returns Vdept by given id if exists.
     *
     * @param vdeptId The id of the Vdept to get; value cannot be null.
     * @return Vdept associated with the given vdeptId.
	 * @throws EntityNotFoundException If no Vdept is found.
     */
    Vdept getById(VdeptId vdeptId);

    /**
     * Find and return the Vdept by given id if exists, returns null otherwise.
     *
     * @param vdeptId The id of the Vdept to get; value cannot be null.
     * @return Vdept associated with the given vdeptId.
     */
    Vdept findById(VdeptId vdeptId);

	/**
     * Find and return the list of Vdepts by given id's.
     *
     * If orderedReturn true, the return List is ordered and positional relative to the incoming ids.
     *
     * In case of unknown entities:
     *
     * If enabled, A null is inserted into the List at the proper position(s).
     * If disabled, the nulls are not put into the return List.
     *
     * @param vdeptIds The id's of the Vdept to get; value cannot be null.
     * @param orderedReturn Should the return List be ordered and positional in relation to the incoming ids?
     * @return Vdepts associated with the given vdeptIds.
     */
    List<Vdept> findByMultipleIds(List<VdeptId> vdeptIds, boolean orderedReturn);


    /**
     * Updates the details of an existing Vdept. It replaces all fields of the existing Vdept with the given vdept.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Vdept if any.
     *
     * @param vdept The details of the Vdept to be updated; value cannot be null.
     * @return The updated Vdept.
     * @throws EntityNotFoundException if no Vdept is found with given input.
     */
    Vdept update(@Valid Vdept vdept);


    /**
     * Partially updates the details of an existing Vdept. It updates only the
     * fields of the existing Vdept which are passed in the vdeptPatch.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Vdept if any.
     *
     * @param vdeptId The id of the Vdept to be deleted; value cannot be null.
     * @param vdeptPatch The partial data of Vdept which is supposed to be updated; value cannot be null.
     * @return The updated Vdept.
     * @throws EntityNotFoundException if no Vdept is found with given input.
     */
    Vdept partialUpdate(VdeptId vdeptId, Map<String, Object> vdeptPatch);

    /**
     * Deletes an existing Vdept with the given id.
     *
     * @param vdeptId The id of the Vdept to be deleted; value cannot be null.
     * @return The deleted Vdept.
     * @throws EntityNotFoundException if no Vdept found with the given id.
     */
    Vdept delete(VdeptId vdeptId);

    /**
     * Deletes an existing Vdept with the given object.
     *
     * @param vdept The instance of the Vdept to be deleted; value cannot be null.
     */
    void delete(Vdept vdept);

    /**
     * Find all Vdepts matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
     *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
     *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Vdepts.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
     */
    @Deprecated
    Page<Vdept> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
     * Find all Vdepts matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Vdepts.
     *
     * @see Pageable
     * @see Page
     */
    Page<Vdept> findAll(String query, Pageable pageable);

    /**
     * Exports all Vdepts matching the given input query to the given exportType format.
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
     * Exports all Vdepts matching the given input query to the given exportType format.
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
     * Retrieve the count of the Vdepts in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
     * @return The count of the Vdept.
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
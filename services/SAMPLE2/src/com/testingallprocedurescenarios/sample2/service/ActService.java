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

import com.testingallprocedurescenarios.sample2.Act;

/**
 * Service object for domain model class {@link Act}.
 */
public interface ActService {

    /**
     * Creates a new Act. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Act if any.
     *
     * @param act Details of the Act to be created; value cannot be null.
     * @return The newly created Act.
     */
    Act create(@Valid Act act);


	/**
     * Returns Act by given id if exists.
     *
     * @param actId The id of the Act to get; value cannot be null.
     * @return Act associated with the given actId.
	 * @throws EntityNotFoundException If no Act is found.
     */
    Act getById(Short actId);

    /**
     * Find and return the Act by given id if exists, returns null otherwise.
     *
     * @param actId The id of the Act to get; value cannot be null.
     * @return Act associated with the given actId.
     */
    Act findById(Short actId);

	/**
     * Find and return the list of Acts by given id's.
     *
     * If orderedReturn true, the return List is ordered and positional relative to the incoming ids.
     *
     * In case of unknown entities:
     *
     * If enabled, A null is inserted into the List at the proper position(s).
     * If disabled, the nulls are not put into the return List.
     *
     * @param actIds The id's of the Act to get; value cannot be null.
     * @param orderedReturn Should the return List be ordered and positional in relation to the incoming ids?
     * @return Acts associated with the given actIds.
     */
    List<Act> findByMultipleIds(List<Short> actIds, boolean orderedReturn);

    /**
     * Find and return the Act for given actno  andactkwd  if exists.
     *
     * @param actno value of actno; value cannot be null.
     * @param actkwd value of actkwd; value cannot be null.
     * @return Act associated with the given inputs.
     * @throws EntityNotFoundException if no matching Act found.
     */
    Act getByActnoAndActkwd(short actno, String actkwd);

    /**
     * Updates the details of an existing Act. It replaces all fields of the existing Act with the given act.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Act if any.
     *
     * @param act The details of the Act to be updated; value cannot be null.
     * @return The updated Act.
     * @throws EntityNotFoundException if no Act is found with given input.
     */
    Act update(@Valid Act act);

    /**
     * Deletes an existing Act with the given id.
     *
     * @param actId The id of the Act to be deleted; value cannot be null.
     * @return The deleted Act.
     * @throws EntityNotFoundException if no Act found with the given id.
     */
    Act delete(Short actId);

    /**
     * Deletes an existing Act with the given object.
     *
     * @param act The instance of the Act to be deleted; value cannot be null.
     */
    void delete(Act act);

    /**
     * Find all Acts matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
     *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
     *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Acts.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
     */
    @Deprecated
    Page<Act> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
     * Find all Acts matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Acts.
     *
     * @see Pageable
     * @see Page
     */
    Page<Act> findAll(String query, Pageable pageable);

    /**
     * Exports all Acts matching the given input query to the given exportType format.
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
     * Exports all Acts matching the given input query to the given exportType format.
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
     * Retrieve the count of the Acts in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
     * @return The count of the Act.
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
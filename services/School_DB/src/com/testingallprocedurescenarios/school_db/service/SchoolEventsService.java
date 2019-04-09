/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.school_db.service;

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

import com.testingallprocedurescenarios.school_db.SchoolEvents;
import com.testingallprocedurescenarios.school_db.SchoolEventsId;

/**
 * Service object for domain model class {@link SchoolEvents}.
 */
public interface SchoolEventsService {

    /**
     * Creates a new SchoolEvents. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on SchoolEvents if any.
     *
     * @param schoolEvents Details of the SchoolEvents to be created; value cannot be null.
     * @return The newly created SchoolEvents.
     */
    SchoolEvents create(@Valid SchoolEvents schoolEvents);


	/**
     * Returns SchoolEvents by given id if exists.
     *
     * @param schooleventsId The id of the SchoolEvents to get; value cannot be null.
     * @return SchoolEvents associated with the given schooleventsId.
	 * @throws EntityNotFoundException If no SchoolEvents is found.
     */
    SchoolEvents getById(SchoolEventsId schooleventsId);

    /**
     * Find and return the SchoolEvents by given id if exists, returns null otherwise.
     *
     * @param schooleventsId The id of the SchoolEvents to get; value cannot be null.
     * @return SchoolEvents associated with the given schooleventsId.
     */
    SchoolEvents findById(SchoolEventsId schooleventsId);

	/**
     * Find and return the list of SchoolEvents by given id's.
     *
     * If orderedReturn true, the return List is ordered and positional relative to the incoming ids.
     *
     * In case of unknown entities:
     *
     * If enabled, A null is inserted into the List at the proper position(s).
     * If disabled, the nulls are not put into the return List.
     *
     * @param schooleventsIds The id's of the SchoolEvents to get; value cannot be null.
     * @param orderedReturn Should the return List be ordered and positional in relation to the incoming ids?
     * @return SchoolEvents associated with the given schooleventsIds.
     */
    List<SchoolEvents> findByMultipleIds(List<SchoolEventsId> schooleventsIds, boolean orderedReturn);


    /**
     * Updates the details of an existing SchoolEvents. It replaces all fields of the existing SchoolEvents with the given schoolEvents.
     *
     * This method overrides the input field values using Server side or database managed properties defined on SchoolEvents if any.
     *
     * @param schoolEvents The details of the SchoolEvents to be updated; value cannot be null.
     * @return The updated SchoolEvents.
     * @throws EntityNotFoundException if no SchoolEvents is found with given input.
     */
    SchoolEvents update(@Valid SchoolEvents schoolEvents);

    /**
     * Deletes an existing SchoolEvents with the given id.
     *
     * @param schooleventsId The id of the SchoolEvents to be deleted; value cannot be null.
     * @return The deleted SchoolEvents.
     * @throws EntityNotFoundException if no SchoolEvents found with the given id.
     */
    SchoolEvents delete(SchoolEventsId schooleventsId);

    /**
     * Deletes an existing SchoolEvents with the given object.
     *
     * @param schoolEvents The instance of the SchoolEvents to be deleted; value cannot be null.
     */
    void delete(SchoolEvents schoolEvents);

    /**
     * Find all SchoolEvents matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
     *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
     *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching SchoolEvents.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
     */
    @Deprecated
    Page<SchoolEvents> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
     * Find all SchoolEvents matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching SchoolEvents.
     *
     * @see Pageable
     * @see Page
     */
    Page<SchoolEvents> findAll(String query, Pageable pageable);

    /**
     * Exports all SchoolEvents matching the given input query to the given exportType format.
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
     * Exports all SchoolEvents matching the given input query to the given exportType format.
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
     * Retrieve the count of the SchoolEvents in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
     * @return The count of the SchoolEvents.
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
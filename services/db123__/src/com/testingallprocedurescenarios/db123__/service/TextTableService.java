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

import com.testingallprocedurescenarios.db123__.TextTable;

/**
 * Service object for domain model class {@link TextTable}.
 */
public interface TextTableService {

    /**
     * Creates a new TextTable. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on TextTable if any.
     *
     * @param textTableInstance Details of the TextTable to be created; value cannot be null.
     * @return The newly created TextTable.
     */
    TextTable create(@Valid TextTable textTableInstance);


	/**
     * Returns TextTable by given id if exists.
     *
     * @param texttableId The id of the TextTable to get; value cannot be null.
     * @return TextTable associated with the given texttableId.
	 * @throws EntityNotFoundException If no TextTable is found.
     */
    TextTable getById(Integer texttableId);

    /**
     * Find and return the TextTable by given id if exists, returns null otherwise.
     *
     * @param texttableId The id of the TextTable to get; value cannot be null.
     * @return TextTable associated with the given texttableId.
     */
    TextTable findById(Integer texttableId);

	/**
     * Find and return the list of TextTables by given id's.
     *
     * If orderedReturn true, the return List is ordered and positional relative to the incoming ids.
     *
     * In case of unknown entities:
     *
     * If enabled, A null is inserted into the List at the proper position(s).
     * If disabled, the nulls are not put into the return List.
     *
     * @param texttableIds The id's of the TextTable to get; value cannot be null.
     * @param orderedReturn Should the return List be ordered and positional in relation to the incoming ids?
     * @return TextTables associated with the given texttableIds.
     */
    List<TextTable> findByMultipleIds(List<Integer> texttableIds, boolean orderedReturn);


    /**
     * Updates the details of an existing TextTable. It replaces all fields of the existing TextTable with the given textTableInstance.
     *
     * This method overrides the input field values using Server side or database managed properties defined on TextTable if any.
     *
     * @param textTableInstance The details of the TextTable to be updated; value cannot be null.
     * @return The updated TextTable.
     * @throws EntityNotFoundException if no TextTable is found with given input.
     */
    TextTable update(@Valid TextTable textTableInstance);

    /**
     * Deletes an existing TextTable with the given id.
     *
     * @param texttableId The id of the TextTable to be deleted; value cannot be null.
     * @return The deleted TextTable.
     * @throws EntityNotFoundException if no TextTable found with the given id.
     */
    TextTable delete(Integer texttableId);

    /**
     * Deletes an existing TextTable with the given object.
     *
     * @param textTableInstance The instance of the TextTable to be deleted; value cannot be null.
     */
    void delete(TextTable textTableInstance);

    /**
     * Find all TextTables matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
     *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
     *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching TextTables.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
     */
    @Deprecated
    Page<TextTable> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
     * Find all TextTables matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching TextTables.
     *
     * @see Pageable
     * @see Page
     */
    Page<TextTable> findAll(String query, Pageable pageable);

    /**
     * Exports all TextTables matching the given input query to the given exportType format.
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
     * Exports all TextTables matching the given input query to the given exportType format.
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
     * Retrieve the count of the TextTables in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
     * @return The count of the TextTable.
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
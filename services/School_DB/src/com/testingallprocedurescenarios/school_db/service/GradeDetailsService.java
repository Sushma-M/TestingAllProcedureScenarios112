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

import com.testingallprocedurescenarios.school_db.GradeDetails;
import com.testingallprocedurescenarios.school_db.Results;

/**
 * Service object for domain model class {@link GradeDetails}.
 */
public interface GradeDetailsService {

    /**
     * Creates a new GradeDetails. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on GradeDetails if any.
     *
     * @param gradeDetails Details of the GradeDetails to be created; value cannot be null.
     * @return The newly created GradeDetails.
     */
    GradeDetails create(@Valid GradeDetails gradeDetails);


	/**
     * Returns GradeDetails by given id if exists.
     *
     * @param gradedetailsId The id of the GradeDetails to get; value cannot be null.
     * @return GradeDetails associated with the given gradedetailsId.
	 * @throws EntityNotFoundException If no GradeDetails is found.
     */
    GradeDetails getById(Integer gradedetailsId);

    /**
     * Find and return the GradeDetails by given id if exists, returns null otherwise.
     *
     * @param gradedetailsId The id of the GradeDetails to get; value cannot be null.
     * @return GradeDetails associated with the given gradedetailsId.
     */
    GradeDetails findById(Integer gradedetailsId);

	/**
     * Find and return the list of GradeDetails by given id's.
     *
     * If orderedReturn true, the return List is ordered and positional relative to the incoming ids.
     *
     * In case of unknown entities:
     *
     * If enabled, A null is inserted into the List at the proper position(s).
     * If disabled, the nulls are not put into the return List.
     *
     * @param gradedetailsIds The id's of the GradeDetails to get; value cannot be null.
     * @param orderedReturn Should the return List be ordered and positional in relation to the incoming ids?
     * @return GradeDetails associated with the given gradedetailsIds.
     */
    List<GradeDetails> findByMultipleIds(List<Integer> gradedetailsIds, boolean orderedReturn);

    /**
     * Find and return the GradeDetails for given grade  if exists.
     *
     * @param grade value of grade; value cannot be null.
     * @return GradeDetails associated with the given inputs.
     * @throws EntityNotFoundException if no matching GradeDetails found.
     */
    GradeDetails getByGrade(String grade);

    /**
     * Updates the details of an existing GradeDetails. It replaces all fields of the existing GradeDetails with the given gradeDetails.
     *
     * This method overrides the input field values using Server side or database managed properties defined on GradeDetails if any.
     *
     * @param gradeDetails The details of the GradeDetails to be updated; value cannot be null.
     * @return The updated GradeDetails.
     * @throws EntityNotFoundException if no GradeDetails is found with given input.
     */
    GradeDetails update(@Valid GradeDetails gradeDetails);


    /**
     * Partially updates the details of an existing GradeDetails. It updates only the
     * fields of the existing GradeDetails which are passed in the gradeDetailsPatch.
     *
     * This method overrides the input field values using Server side or database managed properties defined on GradeDetails if any.
     *
     * @param gradedetailsId The id of the GradeDetails to be deleted; value cannot be null.
     * @param gradeDetailsPatch The partial data of GradeDetails which is supposed to be updated; value cannot be null.
     * @return The updated GradeDetails.
     * @throws EntityNotFoundException if no GradeDetails is found with given input.
     */
    GradeDetails partialUpdate(Integer gradedetailsId, Map<String, Object> gradeDetailsPatch);

    /**
     * Deletes an existing GradeDetails with the given id.
     *
     * @param gradedetailsId The id of the GradeDetails to be deleted; value cannot be null.
     * @return The deleted GradeDetails.
     * @throws EntityNotFoundException if no GradeDetails found with the given id.
     */
    GradeDetails delete(Integer gradedetailsId);

    /**
     * Deletes an existing GradeDetails with the given object.
     *
     * @param gradeDetails The instance of the GradeDetails to be deleted; value cannot be null.
     */
    void delete(GradeDetails gradeDetails);

    /**
     * Find all GradeDetails matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
     *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
     *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching GradeDetails.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
     */
    @Deprecated
    Page<GradeDetails> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
     * Find all GradeDetails matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching GradeDetails.
     *
     * @see Pageable
     * @see Page
     */
    Page<GradeDetails> findAll(String query, Pageable pageable);

    /**
     * Exports all GradeDetails matching the given input query to the given exportType format.
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
     * Exports all GradeDetails matching the given input query to the given exportType format.
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
     * Retrieve the count of the GradeDetails in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
     * @return The count of the GradeDetails.
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
     * Returns the associated resultses for given GradeDetails id.
     *
     * @param gradeId value of gradeId; value cannot be null
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of associated Results instances.
     *
     * @see Pageable
     * @see Page
     */
    Page<Results> findAssociatedResultses(Integer gradeId, Pageable pageable);

}
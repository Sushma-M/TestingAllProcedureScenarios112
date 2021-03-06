/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.dbscenarios.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import com.testingallprocedurescenarios.dbscenarios.models.procedure.*;

public interface DbscenariosProcedureExecutorService {

    ProcedureGetByCurrentDateResponse executeProcedure_GetByCurrentDate();

    SvCurrentDateResponse executeSV_CurrentDate();

    Void executeProcedure_InsertQuery(Byte bytecol, Short shortcol, Integer intcol, Long longcol, Float floatcol, Double doublecol, BigDecimal bigdeccol, BigInteger bigintcol, Character charcol, String stringcol, String clobcol, String textcol, Date datecol, Time timecol, LocalDateTime datetimecol, Timestamp timestampcol, Boolean booleancol);

    ProcedureCurrentDatetimeResponse executeProcedure_CurrentDatetime(LocalDateTime datetimecol);

    Void executeProcedure_Insert(Byte bytecol, Short shortcol, Integer intcol, Long longcol, Float floatcol, Double doublecol, BigDecimal bigdeccol, BigInteger bigintcol, Character charcol, String stringcol, String clobcol, String textcol, Date datecol, Time timecol, LocalDateTime datetimecol, Timestamp timestampcol, Boolean booleancol);

    Void executeProcedure_InsertRequiredFalse(Byte bytecol, Short shortcol, Integer intcol, Long longcol, Float floatcol, Double doublecol, BigDecimal bigdeccol, BigInteger bigintcol, Character charcol, String stringcol, String clobcol, String textcol, Date datecol, Time timecol, LocalDateTime datetimecol, Timestamp timestampcol, Boolean booleancol);

}
package com.memsql.spark

import org.apache.spark.SparkException

class MemSQLException extends Exception

class SaveToMemSQLException(val exception: SparkException, val successfullyInserted: Long) extends MemSQLException {
  override def getMessage: String = s"SaveToMemSQLException: $exception"
}

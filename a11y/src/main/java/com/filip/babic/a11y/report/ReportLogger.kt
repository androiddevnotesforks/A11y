package com.filip.babic.a11y.report

import android.util.Log
import com.filip.babic.a11y.report.model.Report

/**
 * Logs the serialized report into a text file, which is then saved locally.
 */
internal class ReportLogger {

  fun logReport(report: Report) {
    Log.d("report", report.toString())
  }
}
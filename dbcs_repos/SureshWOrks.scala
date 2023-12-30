// Databricks notebook source
spark.version

// COMMAND ----------

val df= spark.read.format("orc").load(" ")
df.printSchema()
df.show();

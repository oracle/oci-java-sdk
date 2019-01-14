/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.util.internal;

/**
 * For list collections that we send in the query string, describes the different
 * ways we can encode it in the query string.
 *
 *
 * Values and meanings align with the different collectionFormat values in Swagger. Each of the
 * *Separated enum members describes a different delimiter character, whereas the Multi value means that
 * each collection member will appear as a separate entry in the query string of the form
 * <query_string_param_name>=<collection member>.
 */
public enum CollectionFormatType {
    CommaSeparated,
    PipeSeparated,
    SpaceSeparated,
    TabSeparated,
    Multi;
}

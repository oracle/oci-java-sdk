/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
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

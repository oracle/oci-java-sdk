/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.functions.model;

/**
 * The details required to create an Archive-based function source. This mode is used when the
 * function code is provided as an archive, either from Object Storage or directly uploaded by the
 * API caller. It is suitable for scenarios where the function code is packaged as a single archive
 * file. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260325")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "archiveSourceType",
        defaultImpl = CreateArchiveSourceDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateDirectArchiveSourceDetails.class,
            name = "DIRECT_ARCHIVE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateObjectStorageArchiveSourceDetails.class,
            name = "OBJECT_STORAGE_ARCHIVE")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class CreateArchiveSourceDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({})
    protected CreateArchiveSourceDetails() {
        super();
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateArchiveSourceDetails(");
        sb.append("super=").append(super.toString());
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateArchiveSourceDetails)) {
            return false;
        }

        CreateArchiveSourceDetails other = (CreateArchiveSourceDetails) o;
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** Type of the Archive Source. Possible values: OBJECT_STORAGE_ARCHIVE and DIRECT_ARCHIVE. */
    public enum ArchiveSourceType implements com.oracle.bmc.http.internal.BmcEnum {
        ObjectStorageArchive("OBJECT_STORAGE_ARCHIVE"),
        DirectArchive("DIRECT_ARCHIVE"),
        ;

        private final String value;
        private static java.util.Map<String, ArchiveSourceType> map;

        static {
            map = new java.util.HashMap<>();
            for (ArchiveSourceType v : ArchiveSourceType.values()) {
                map.put(v.getValue(), v);
            }
        }

        ArchiveSourceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ArchiveSourceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ArchiveSourceType: " + key);
        }
    };
}

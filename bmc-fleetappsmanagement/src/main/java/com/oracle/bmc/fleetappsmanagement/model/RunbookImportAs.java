/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Runbook import as type. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "importType",
        defaultImpl = RunbookImportAs.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = RunbookImportAsVersion.class,
            name = "RUNBOOK_VERSION"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = RunbookImportAsRunbook.class,
            name = "RUNBOOK")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class RunbookImportAs extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"version", "importOption"})
    protected RunbookImportAs(String version, ImportRunbookDetails.ImportOption importOption) {
        super();
        this.version = version;
        this.importOption = importOption;
    }

    /** Version number. */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * Version number.
     *
     * @return the value
     */
    public String getVersion() {
        return version;
    }

    /** ImportOptions for Runbook. */
    @com.fasterxml.jackson.annotation.JsonProperty("importOption")
    private final ImportRunbookDetails.ImportOption importOption;

    /**
     * ImportOptions for Runbook.
     *
     * @return the value
     */
    public ImportRunbookDetails.ImportOption getImportOption() {
        return importOption;
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
        sb.append("RunbookImportAs(");
        sb.append("super=").append(super.toString());
        sb.append("version=").append(String.valueOf(this.version));
        sb.append(", importOption=").append(String.valueOf(this.importOption));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RunbookImportAs)) {
            return false;
        }

        RunbookImportAs other = (RunbookImportAs) o;
        return java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.importOption, other.importOption)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.importOption == null ? 43 : this.importOption.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** Import type. */
    public enum ImportType implements com.oracle.bmc.http.internal.BmcEnum {
        Runbook("RUNBOOK"),
        RunbookVersion("RUNBOOK_VERSION"),
        ;

        private final String value;
        private static java.util.Map<String, ImportType> map;

        static {
            map = new java.util.HashMap<>();
            for (ImportType v : ImportType.values()) {
                map.put(v.getValue(), v);
            }
        }

        ImportType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ImportType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ImportType: " + key);
        }
    };
}

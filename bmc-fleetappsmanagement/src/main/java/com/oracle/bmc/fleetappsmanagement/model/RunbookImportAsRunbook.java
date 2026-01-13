/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Import as Runbook. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RunbookImportAsRunbook.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "importType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RunbookImportAsRunbook extends RunbookImportAs {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("importOption")
        private ImportRunbookDetails.ImportOption importOption;

        public Builder importOption(ImportRunbookDetails.ImportOption importOption) {
            this.importOption = importOption;
            this.__explicitlySet__.add("importOption");
            return this;
        }
        /** Only for RUNBOOK importType. */
        @com.fasterxml.jackson.annotation.JsonProperty("runbookName")
        private String runbookName;

        /**
         * Only for RUNBOOK importType.
         *
         * @param runbookName the value to set
         * @return this builder
         */
        public Builder runbookName(String runbookName) {
            this.runbookName = runbookName;
            this.__explicitlySet__.add("runbookName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RunbookImportAsRunbook build() {
            RunbookImportAsRunbook model =
                    new RunbookImportAsRunbook(this.version, this.importOption, this.runbookName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RunbookImportAsRunbook model) {
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("importOption")) {
                this.importOption(model.getImportOption());
            }
            if (model.wasPropertyExplicitlySet("runbookName")) {
                this.runbookName(model.getRunbookName());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public RunbookImportAsRunbook(
            String version, ImportRunbookDetails.ImportOption importOption, String runbookName) {
        super(version, importOption);
        this.runbookName = runbookName;
    }

    /** Only for RUNBOOK importType. */
    @com.fasterxml.jackson.annotation.JsonProperty("runbookName")
    private final String runbookName;

    /**
     * Only for RUNBOOK importType.
     *
     * @return the value
     */
    public String getRunbookName() {
        return runbookName;
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
        sb.append("RunbookImportAsRunbook(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", runbookName=").append(String.valueOf(this.runbookName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RunbookImportAsRunbook)) {
            return false;
        }

        RunbookImportAsRunbook other = (RunbookImportAsRunbook) o;
        return java.util.Objects.equals(this.runbookName, other.runbookName) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.runbookName == null ? 43 : this.runbookName.hashCode());
        return result;
    }
}

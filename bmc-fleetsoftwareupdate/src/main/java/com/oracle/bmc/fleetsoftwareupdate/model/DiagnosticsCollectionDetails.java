/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.model;

/**
 * Details to configure diagnostics collection for targets affected by this Exadata Fleet Update
 * Maintenance Cycle. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220528")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DiagnosticsCollectionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DiagnosticsCollectionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"logCollectionMode"})
    public DiagnosticsCollectionDetails(DataCollectionModes logCollectionMode) {
        super();
        this.logCollectionMode = logCollectionMode;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Enable incident logs and trace collection. Allow Oracle to collect incident logs and
         * traces to enable fault diagnosis and issue resolution according to the selected mode.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("logCollectionMode")
        private DataCollectionModes logCollectionMode;

        /**
         * Enable incident logs and trace collection. Allow Oracle to collect incident logs and
         * traces to enable fault diagnosis and issue resolution according to the selected mode.
         *
         * @param logCollectionMode the value to set
         * @return this builder
         */
        public Builder logCollectionMode(DataCollectionModes logCollectionMode) {
            this.logCollectionMode = logCollectionMode;
            this.__explicitlySet__.add("logCollectionMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DiagnosticsCollectionDetails build() {
            DiagnosticsCollectionDetails model =
                    new DiagnosticsCollectionDetails(this.logCollectionMode);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DiagnosticsCollectionDetails model) {
            if (model.wasPropertyExplicitlySet("logCollectionMode")) {
                this.logCollectionMode(model.getLogCollectionMode());
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

    /**
     * Enable incident logs and trace collection. Allow Oracle to collect incident logs and traces
     * to enable fault diagnosis and issue resolution according to the selected mode.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logCollectionMode")
    private final DataCollectionModes logCollectionMode;

    /**
     * Enable incident logs and trace collection. Allow Oracle to collect incident logs and traces
     * to enable fault diagnosis and issue resolution according to the selected mode.
     *
     * @return the value
     */
    public DataCollectionModes getLogCollectionMode() {
        return logCollectionMode;
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
        sb.append("DiagnosticsCollectionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("logCollectionMode=").append(String.valueOf(this.logCollectionMode));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DiagnosticsCollectionDetails)) {
            return false;
        }

        DiagnosticsCollectionDetails other = (DiagnosticsCollectionDetails) o;
        return java.util.Objects.equals(this.logCollectionMode, other.logCollectionMode)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.logCollectionMode == null ? 43 : this.logCollectionMode.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

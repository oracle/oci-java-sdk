/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Request to Export Runbook. <br>
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
        builder = ExportRunbookDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExportRunbookDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"contentDestination", "exportAs"})
    public ExportRunbookDetails(
            TransferRunbookContentDetails contentDestination, ExportAs exportAs) {
        super();
        this.contentDestination = contentDestination;
        this.exportAs = exportAs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("contentDestination")
        private TransferRunbookContentDetails contentDestination;

        public Builder contentDestination(TransferRunbookContentDetails contentDestination) {
            this.contentDestination = contentDestination;
            this.__explicitlySet__.add("contentDestination");
            return this;
        }
        /** Export Runbook As Type. */
        @com.fasterxml.jackson.annotation.JsonProperty("exportAs")
        private ExportAs exportAs;

        /**
         * Export Runbook As Type.
         *
         * @param exportAs the value to set
         * @return this builder
         */
        public Builder exportAs(ExportAs exportAs) {
            this.exportAs = exportAs;
            this.__explicitlySet__.add("exportAs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExportRunbookDetails build() {
            ExportRunbookDetails model =
                    new ExportRunbookDetails(this.contentDestination, this.exportAs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExportRunbookDetails model) {
            if (model.wasPropertyExplicitlySet("contentDestination")) {
                this.contentDestination(model.getContentDestination());
            }
            if (model.wasPropertyExplicitlySet("exportAs")) {
                this.exportAs(model.getExportAs());
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

    @com.fasterxml.jackson.annotation.JsonProperty("contentDestination")
    private final TransferRunbookContentDetails contentDestination;

    public TransferRunbookContentDetails getContentDestination() {
        return contentDestination;
    }

    /** Export Runbook As Type. */
    public enum ExportAs implements com.oracle.bmc.http.internal.BmcEnum {
        Terraform("TERRAFORM"),
        NonTerraform("NON_TERRAFORM"),
        ;

        private final String value;
        private static java.util.Map<String, ExportAs> map;

        static {
            map = new java.util.HashMap<>();
            for (ExportAs v : ExportAs.values()) {
                map.put(v.getValue(), v);
            }
        }

        ExportAs(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ExportAs create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ExportAs: " + key);
        }
    };
    /** Export Runbook As Type. */
    @com.fasterxml.jackson.annotation.JsonProperty("exportAs")
    private final ExportAs exportAs;

    /**
     * Export Runbook As Type.
     *
     * @return the value
     */
    public ExportAs getExportAs() {
        return exportAs;
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
        sb.append("ExportRunbookDetails(");
        sb.append("super=").append(super.toString());
        sb.append("contentDestination=").append(String.valueOf(this.contentDestination));
        sb.append(", exportAs=").append(String.valueOf(this.exportAs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExportRunbookDetails)) {
            return false;
        }

        ExportRunbookDetails other = (ExportRunbookDetails) o;
        return java.util.Objects.equals(this.contentDestination, other.contentDestination)
                && java.util.Objects.equals(this.exportAs, other.exportAs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.contentDestination == null
                                ? 43
                                : this.contentDestination.hashCode());
        result = (result * PRIME) + (this.exportAs == null ? 43 : this.exportAs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * A list of LogAnalyticsWarning references. Used as input to APIs which operate on a list. For
 * example, the suppress warning API accepts a list of warning references and will suppress all
 * warnings in the input list. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = WarningReferenceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class WarningReferenceDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"warningReferences"})
    public WarningReferenceDetails(java.util.List<String> warningReferences) {
        super();
        this.warningReferences = warningReferences;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A list of LogAnalyticsWarning references. Used as input to APIs which operate on a list.
         * For example, the suppress warning API accepts a list of warning references and will
         * suppress all warnings in the input list.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("warningReferences")
        private java.util.List<String> warningReferences;

        /**
         * A list of LogAnalyticsWarning references. Used as input to APIs which operate on a list.
         * For example, the suppress warning API accepts a list of warning references and will
         * suppress all warnings in the input list.
         *
         * @param warningReferences the value to set
         * @return this builder
         */
        public Builder warningReferences(java.util.List<String> warningReferences) {
            this.warningReferences = warningReferences;
            this.__explicitlySet__.add("warningReferences");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WarningReferenceDetails build() {
            WarningReferenceDetails model = new WarningReferenceDetails(this.warningReferences);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WarningReferenceDetails model) {
            if (model.wasPropertyExplicitlySet("warningReferences")) {
                this.warningReferences(model.getWarningReferences());
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
     * A list of LogAnalyticsWarning references. Used as input to APIs which operate on a list. For
     * example, the suppress warning API accepts a list of warning references and will suppress all
     * warnings in the input list.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("warningReferences")
    private final java.util.List<String> warningReferences;

    /**
     * A list of LogAnalyticsWarning references. Used as input to APIs which operate on a list. For
     * example, the suppress warning API accepts a list of warning references and will suppress all
     * warnings in the input list.
     *
     * @return the value
     */
    public java.util.List<String> getWarningReferences() {
        return warningReferences;
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
        sb.append("WarningReferenceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("warningReferences=").append(String.valueOf(this.warningReferences));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WarningReferenceDetails)) {
            return false;
        }

        WarningReferenceDetails other = (WarningReferenceDetails) o;
        return java.util.Objects.equals(this.warningReferences, other.warningReferences)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.warningReferences == null ? 43 : this.warningReferences.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * CryptoEventAnalysis configuration <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CryptoEventAnalysis.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CryptoEventAnalysis
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isEnabled", "summarizedEventsLog"})
    public CryptoEventAnalysis(Boolean isEnabled, SummarizedEventsLog summarizedEventsLog) {
        super();
        this.isEnabled = isEnabled;
        this.summarizedEventsLog = summarizedEventsLog;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** CryptoEventAnalysis flag to store enabled or disabled status */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * CryptoEventAnalysis flag to store enabled or disabled status
         *
         * @param isEnabled the value to set
         * @return this builder
         */
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("summarizedEventsLog")
        private SummarizedEventsLog summarizedEventsLog;

        public Builder summarizedEventsLog(SummarizedEventsLog summarizedEventsLog) {
            this.summarizedEventsLog = summarizedEventsLog;
            this.__explicitlySet__.add("summarizedEventsLog");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CryptoEventAnalysis build() {
            CryptoEventAnalysis model =
                    new CryptoEventAnalysis(this.isEnabled, this.summarizedEventsLog);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CryptoEventAnalysis model) {
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("summarizedEventsLog")) {
                this.summarizedEventsLog(model.getSummarizedEventsLog());
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

    /** CryptoEventAnalysis flag to store enabled or disabled status */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * CryptoEventAnalysis flag to store enabled or disabled status
     *
     * @return the value
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("summarizedEventsLog")
    private final SummarizedEventsLog summarizedEventsLog;

    public SummarizedEventsLog getSummarizedEventsLog() {
        return summarizedEventsLog;
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
        sb.append("CryptoEventAnalysis(");
        sb.append("super=").append(super.toString());
        sb.append("isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", summarizedEventsLog=").append(String.valueOf(this.summarizedEventsLog));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CryptoEventAnalysis)) {
            return false;
        }

        CryptoEventAnalysis other = (CryptoEventAnalysis) o;
        return java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.summarizedEventsLog, other.summarizedEventsLog)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.summarizedEventsLog == null
                                ? 43
                                : this.summarizedEventsLog.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

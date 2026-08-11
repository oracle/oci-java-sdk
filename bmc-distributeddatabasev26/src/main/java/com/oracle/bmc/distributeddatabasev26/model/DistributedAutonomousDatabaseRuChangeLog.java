/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabasev26.model;

/**
 * Move RU invocation history for the Globally distributed autonomous database. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DistributedAutonomousDatabaseRuChangeLog.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DistributedAutonomousDatabaseRuChangeLog
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"ruChangeLog"})
    public DistributedAutonomousDatabaseRuChangeLog(
            java.util.List<DistributedAutonomousDatabaseRuChangeLogSummary> ruChangeLog) {
        super();
        this.ruChangeLog = ruChangeLog;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Ordered list of move RU invocations (latest first). */
        @com.fasterxml.jackson.annotation.JsonProperty("ruChangeLog")
        private java.util.List<DistributedAutonomousDatabaseRuChangeLogSummary> ruChangeLog;

        /**
         * Ordered list of move RU invocations (latest first).
         *
         * @param ruChangeLog the value to set
         * @return this builder
         */
        public Builder ruChangeLog(
                java.util.List<DistributedAutonomousDatabaseRuChangeLogSummary> ruChangeLog) {
            this.ruChangeLog = ruChangeLog;
            this.__explicitlySet__.add("ruChangeLog");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DistributedAutonomousDatabaseRuChangeLog build() {
            DistributedAutonomousDatabaseRuChangeLog model =
                    new DistributedAutonomousDatabaseRuChangeLog(this.ruChangeLog);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DistributedAutonomousDatabaseRuChangeLog model) {
            if (model.wasPropertyExplicitlySet("ruChangeLog")) {
                this.ruChangeLog(model.getRuChangeLog());
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

    /** Ordered list of move RU invocations (latest first). */
    @com.fasterxml.jackson.annotation.JsonProperty("ruChangeLog")
    private final java.util.List<DistributedAutonomousDatabaseRuChangeLogSummary> ruChangeLog;

    /**
     * Ordered list of move RU invocations (latest first).
     *
     * @return the value
     */
    public java.util.List<DistributedAutonomousDatabaseRuChangeLogSummary> getRuChangeLog() {
        return ruChangeLog;
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
        sb.append("DistributedAutonomousDatabaseRuChangeLog(");
        sb.append("super=").append(super.toString());
        sb.append("ruChangeLog=").append(String.valueOf(this.ruChangeLog));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DistributedAutonomousDatabaseRuChangeLog)) {
            return false;
        }

        DistributedAutonomousDatabaseRuChangeLog other =
                (DistributedAutonomousDatabaseRuChangeLog) o;
        return java.util.Objects.equals(this.ruChangeLog, other.ruChangeLog) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.ruChangeLog == null ? 43 : this.ruChangeLog.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

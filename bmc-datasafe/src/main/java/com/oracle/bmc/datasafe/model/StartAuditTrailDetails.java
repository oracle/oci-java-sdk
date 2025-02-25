/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The details used to  start an audit trail.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = StartAuditTrailDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class StartAuditTrailDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"auditCollectionStartTime", "isAutoPurgeEnabled"})
    public StartAuditTrailDetails(
            java.util.Date auditCollectionStartTime, Boolean isAutoPurgeEnabled) {
        super();
        this.auditCollectionStartTime = auditCollectionStartTime;
        this.isAutoPurgeEnabled = isAutoPurgeEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The date from which the audit trail must start collecting data, in the format defined by RFC3339.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("auditCollectionStartTime")
        private java.util.Date auditCollectionStartTime;

        /**
         * The date from which the audit trail must start collecting data, in the format defined by RFC3339.
         * @param auditCollectionStartTime the value to set
         * @return this builder
         **/
        public Builder auditCollectionStartTime(java.util.Date auditCollectionStartTime) {
            this.auditCollectionStartTime = auditCollectionStartTime;
            this.__explicitlySet__.add("auditCollectionStartTime");
            return this;
        }
        /**
         * Indicates if auto purge is enabled on the target database, which helps delete audit data in the
         * target database every seven days so that the database's audit trail does not become too large.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoPurgeEnabled")
        private Boolean isAutoPurgeEnabled;

        /**
         * Indicates if auto purge is enabled on the target database, which helps delete audit data in the
         * target database every seven days so that the database's audit trail does not become too large.
         *
         * @param isAutoPurgeEnabled the value to set
         * @return this builder
         **/
        public Builder isAutoPurgeEnabled(Boolean isAutoPurgeEnabled) {
            this.isAutoPurgeEnabled = isAutoPurgeEnabled;
            this.__explicitlySet__.add("isAutoPurgeEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StartAuditTrailDetails build() {
            StartAuditTrailDetails model =
                    new StartAuditTrailDetails(
                            this.auditCollectionStartTime, this.isAutoPurgeEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StartAuditTrailDetails model) {
            if (model.wasPropertyExplicitlySet("auditCollectionStartTime")) {
                this.auditCollectionStartTime(model.getAuditCollectionStartTime());
            }
            if (model.wasPropertyExplicitlySet("isAutoPurgeEnabled")) {
                this.isAutoPurgeEnabled(model.getIsAutoPurgeEnabled());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The date from which the audit trail must start collecting data, in the format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("auditCollectionStartTime")
    private final java.util.Date auditCollectionStartTime;

    /**
     * The date from which the audit trail must start collecting data, in the format defined by RFC3339.
     * @return the value
     **/
    public java.util.Date getAuditCollectionStartTime() {
        return auditCollectionStartTime;
    }

    /**
     * Indicates if auto purge is enabled on the target database, which helps delete audit data in the
     * target database every seven days so that the database's audit trail does not become too large.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoPurgeEnabled")
    private final Boolean isAutoPurgeEnabled;

    /**
     * Indicates if auto purge is enabled on the target database, which helps delete audit data in the
     * target database every seven days so that the database's audit trail does not become too large.
     *
     * @return the value
     **/
    public Boolean getIsAutoPurgeEnabled() {
        return isAutoPurgeEnabled;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StartAuditTrailDetails(");
        sb.append("super=").append(super.toString());
        sb.append("auditCollectionStartTime=")
                .append(String.valueOf(this.auditCollectionStartTime));
        sb.append(", isAutoPurgeEnabled=").append(String.valueOf(this.isAutoPurgeEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StartAuditTrailDetails)) {
            return false;
        }

        StartAuditTrailDetails other = (StartAuditTrailDetails) o;
        return java.util.Objects.equals(
                        this.auditCollectionStartTime, other.auditCollectionStartTime)
                && java.util.Objects.equals(this.isAutoPurgeEnabled, other.isAutoPurgeEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.auditCollectionStartTime == null
                                ? 43
                                : this.auditCollectionStartTime.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoPurgeEnabled == null
                                ? 43
                                : this.isAutoPurgeEnabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

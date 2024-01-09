/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.sch.model;

/**
 * The log group used for the Logging Analytics target. For configuration instructions, see [To
 * create a service
 * connector](https://docs.cloud.oracle.com/iaas/Content/service-connector-hub/managingconnectors.htm#create).
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200909")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = LoggingAnalyticsTargetDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "kind")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LoggingAnalyticsTargetDetails extends TargetDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the Logging Analytics log group.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("logGroupId")
        private String logGroupId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the Logging Analytics log group.
         *
         * @param logGroupId the value to set
         * @return this builder
         */
        public Builder logGroupId(String logGroupId) {
            this.logGroupId = logGroupId;
            this.__explicitlySet__.add("logGroupId");
            return this;
        }
        /**
         * Identifier of the log source that you want to use for processing data received from the
         * service connector source. Applies to {@code StreamingSource} only. Equivalent to {@code
         * name} at {@link LogAnalyticsSource}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("logSourceIdentifier")
        private String logSourceIdentifier;

        /**
         * Identifier of the log source that you want to use for processing data received from the
         * service connector source. Applies to {@code StreamingSource} only. Equivalent to {@code
         * name} at {@link LogAnalyticsSource}.
         *
         * @param logSourceIdentifier the value to set
         * @return this builder
         */
        public Builder logSourceIdentifier(String logSourceIdentifier) {
            this.logSourceIdentifier = logSourceIdentifier;
            this.__explicitlySet__.add("logSourceIdentifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LoggingAnalyticsTargetDetails build() {
            LoggingAnalyticsTargetDetails model =
                    new LoggingAnalyticsTargetDetails(this.logGroupId, this.logSourceIdentifier);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LoggingAnalyticsTargetDetails model) {
            if (model.wasPropertyExplicitlySet("logGroupId")) {
                this.logGroupId(model.getLogGroupId());
            }
            if (model.wasPropertyExplicitlySet("logSourceIdentifier")) {
                this.logSourceIdentifier(model.getLogSourceIdentifier());
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
    public LoggingAnalyticsTargetDetails(String logGroupId, String logSourceIdentifier) {
        super();
        this.logGroupId = logGroupId;
        this.logSourceIdentifier = logSourceIdentifier;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the Logging Analytics log group.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logGroupId")
    private final String logGroupId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the Logging Analytics log group.
     *
     * @return the value
     */
    public String getLogGroupId() {
        return logGroupId;
    }

    /**
     * Identifier of the log source that you want to use for processing data received from the
     * service connector source. Applies to {@code StreamingSource} only. Equivalent to {@code name}
     * at {@link LogAnalyticsSource}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logSourceIdentifier")
    private final String logSourceIdentifier;

    /**
     * Identifier of the log source that you want to use for processing data received from the
     * service connector source. Applies to {@code StreamingSource} only. Equivalent to {@code name}
     * at {@link LogAnalyticsSource}.
     *
     * @return the value
     */
    public String getLogSourceIdentifier() {
        return logSourceIdentifier;
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
        sb.append("LoggingAnalyticsTargetDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", logGroupId=").append(String.valueOf(this.logGroupId));
        sb.append(", logSourceIdentifier=").append(String.valueOf(this.logSourceIdentifier));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LoggingAnalyticsTargetDetails)) {
            return false;
        }

        LoggingAnalyticsTargetDetails other = (LoggingAnalyticsTargetDetails) o;
        return java.util.Objects.equals(this.logGroupId, other.logGroupId)
                && java.util.Objects.equals(this.logSourceIdentifier, other.logSourceIdentifier)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.logGroupId == null ? 43 : this.logGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.logSourceIdentifier == null
                                ? 43
                                : this.logSourceIdentifier.hashCode());
        return result;
    }
}

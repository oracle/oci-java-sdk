/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Audit policy details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AuditPolicyEntryDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "entryType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AuditPolicyEntryDetails extends EntryDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The status of Data Safe user exclusion in the audit policy. */
        @com.fasterxml.jackson.annotation.JsonProperty("datasafeUserExclusionStatus")
        private DatasafeUserExclusionStatus datasafeUserExclusionStatus;

        /**
         * The status of Data Safe user exclusion in the audit policy.
         *
         * @param datasafeUserExclusionStatus the value to set
         * @return this builder
         */
        public Builder datasafeUserExclusionStatus(
                DatasafeUserExclusionStatus datasafeUserExclusionStatus) {
            this.datasafeUserExclusionStatus = datasafeUserExclusionStatus;
            this.__explicitlySet__.add("datasafeUserExclusionStatus");
            return this;
        }
        /** Specifies why exclusion of the Data Safe user did not succeed. */
        @com.fasterxml.jackson.annotation.JsonProperty("excludeDatasafeUserFailureMsg")
        private String excludeDatasafeUserFailureMsg;

        /**
         * Specifies why exclusion of the Data Safe user did not succeed.
         *
         * @param excludeDatasafeUserFailureMsg the value to set
         * @return this builder
         */
        public Builder excludeDatasafeUserFailureMsg(String excludeDatasafeUserFailureMsg) {
            this.excludeDatasafeUserFailureMsg = excludeDatasafeUserFailureMsg;
            this.__explicitlySet__.add("excludeDatasafeUserFailureMsg");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AuditPolicyEntryDetails build() {
            AuditPolicyEntryDetails model =
                    new AuditPolicyEntryDetails(
                            this.datasafeUserExclusionStatus, this.excludeDatasafeUserFailureMsg);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AuditPolicyEntryDetails model) {
            if (model.wasPropertyExplicitlySet("datasafeUserExclusionStatus")) {
                this.datasafeUserExclusionStatus(model.getDatasafeUserExclusionStatus());
            }
            if (model.wasPropertyExplicitlySet("excludeDatasafeUserFailureMsg")) {
                this.excludeDatasafeUserFailureMsg(model.getExcludeDatasafeUserFailureMsg());
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
    public AuditPolicyEntryDetails(
            DatasafeUserExclusionStatus datasafeUserExclusionStatus,
            String excludeDatasafeUserFailureMsg) {
        super();
        this.datasafeUserExclusionStatus = datasafeUserExclusionStatus;
        this.excludeDatasafeUserFailureMsg = excludeDatasafeUserFailureMsg;
    }

    /** The status of Data Safe user exclusion in the audit policy. */
    public enum DatasafeUserExclusionStatus implements com.oracle.bmc.http.internal.BmcEnum {
        ExcludedSuccess("EXCLUDED_SUCCESS"),
        ExcludedFailed("EXCLUDED_FAILED"),
        NotExcluded("NOT_EXCLUDED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DatasafeUserExclusionStatus.class);

        private final String value;
        private static java.util.Map<String, DatasafeUserExclusionStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (DatasafeUserExclusionStatus v : DatasafeUserExclusionStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DatasafeUserExclusionStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DatasafeUserExclusionStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DatasafeUserExclusionStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The status of Data Safe user exclusion in the audit policy. */
    @com.fasterxml.jackson.annotation.JsonProperty("datasafeUserExclusionStatus")
    private final DatasafeUserExclusionStatus datasafeUserExclusionStatus;

    /**
     * The status of Data Safe user exclusion in the audit policy.
     *
     * @return the value
     */
    public DatasafeUserExclusionStatus getDatasafeUserExclusionStatus() {
        return datasafeUserExclusionStatus;
    }

    /** Specifies why exclusion of the Data Safe user did not succeed. */
    @com.fasterxml.jackson.annotation.JsonProperty("excludeDatasafeUserFailureMsg")
    private final String excludeDatasafeUserFailureMsg;

    /**
     * Specifies why exclusion of the Data Safe user did not succeed.
     *
     * @return the value
     */
    public String getExcludeDatasafeUserFailureMsg() {
        return excludeDatasafeUserFailureMsg;
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
        sb.append("AuditPolicyEntryDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", datasafeUserExclusionStatus=")
                .append(String.valueOf(this.datasafeUserExclusionStatus));
        sb.append(", excludeDatasafeUserFailureMsg=")
                .append(String.valueOf(this.excludeDatasafeUserFailureMsg));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AuditPolicyEntryDetails)) {
            return false;
        }

        AuditPolicyEntryDetails other = (AuditPolicyEntryDetails) o;
        return java.util.Objects.equals(
                        this.datasafeUserExclusionStatus, other.datasafeUserExclusionStatus)
                && java.util.Objects.equals(
                        this.excludeDatasafeUserFailureMsg, other.excludeDatasafeUserFailureMsg)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.datasafeUserExclusionStatus == null
                                ? 43
                                : this.datasafeUserExclusionStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.excludeDatasafeUserFailureMsg == null
                                ? 43
                                : this.excludeDatasafeUserFailureMsg.hashCode());
        return result;
    }
}

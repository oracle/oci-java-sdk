/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.filestorage.model;

/**
 * Summary information for a principal's usage and quota rule. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20171215")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = QuotaRuleSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class QuotaRuleSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "fileSystemId",
        "principalType",
        "principalId",
        "isHardQuota",
        "displayName",
        "usageInBytes",
        "quotaLimitInGigabytes",
        "timeCreated",
        "timeUpdated",
        "areViolatorsOnly"
    })
    public QuotaRuleSummary(
            String id,
            String fileSystemId,
            PrincipalType principalType,
            Integer principalId,
            Boolean isHardQuota,
            String displayName,
            Long usageInBytes,
            Integer quotaLimitInGigabytes,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            Boolean areViolatorsOnly) {
        super();
        this.id = id;
        this.fileSystemId = fileSystemId;
        this.principalType = principalType;
        this.principalId = principalId;
        this.isHardQuota = isHardQuota;
        this.displayName = displayName;
        this.usageInBytes = usageInBytes;
        this.quotaLimitInGigabytes = quotaLimitInGigabytes;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.areViolatorsOnly = areViolatorsOnly;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The identifier of the quota rule. It is the base64 encoded string of the tuple
         * <principalId, principalType, isHardQuota>.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The identifier of the quota rule. It is the base64 encoded string of the tuple
         * <principalId, principalType, isHardQuota>.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * file system.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("fileSystemId")
        private String fileSystemId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * file system.
         *
         * @param fileSystemId the value to set
         * @return this builder
         */
        public Builder fileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            this.__explicitlySet__.add("fileSystemId");
            return this;
        }
        /** The type of the owner of this quota rule and usage. */
        @com.fasterxml.jackson.annotation.JsonProperty("principalType")
        private PrincipalType principalType;

        /**
         * The type of the owner of this quota rule and usage.
         *
         * @param principalType the value to set
         * @return this builder
         */
        public Builder principalType(PrincipalType principalType) {
            this.principalType = principalType;
            this.__explicitlySet__.add("principalType");
            return this;
        }
        /**
         * An identifier for the user or the group associated with quota rule and usage. UNIX-like
         * operating systems use this integer value to identify a user or group to manage access
         * control.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("principalId")
        private Integer principalId;

        /**
         * An identifier for the user or the group associated with quota rule and usage. UNIX-like
         * operating systems use this integer value to identify a user or group to manage access
         * control.
         *
         * @param principalId the value to set
         * @return this builder
         */
        public Builder principalId(Integer principalId) {
            this.principalId = principalId;
            this.__explicitlySet__.add("principalId");
            return this;
        }
        /**
         * Whether the quota rule will be enforced. If {@code isHardQuota} is true, the quota rule
         * is enforced so that the write is blocked if usage exceeds the hard quota limit. If {@code
         * isHardQuota} is false, writes succeed even if usage exceeds the soft quota limit, but the
         * quota rule is violated.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isHardQuota")
        private Boolean isHardQuota;

        /**
         * Whether the quota rule will be enforced. If {@code isHardQuota} is true, the quota rule
         * is enforced so that the write is blocked if usage exceeds the hard quota limit. If {@code
         * isHardQuota} is false, writes succeed even if usage exceeds the soft quota limit, but the
         * quota rule is violated.
         *
         * @param isHardQuota the value to set
         * @return this builder
         */
        public Builder isHardQuota(Boolean isHardQuota) {
            this.isHardQuota = isHardQuota;
            this.__explicitlySet__.add("isHardQuota");
            return this;
        }
        /**
         * A user-friendly name. It does not have to be unique, and it is changeable. Avoid entering
         * confidential information. Example: {@code UserXYZ's quota}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. It does not have to be unique, and it is changeable. Avoid entering
         * confidential information. Example: {@code UserXYZ's quota}
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The usage value corresponding to this principal in bytes. */
        @com.fasterxml.jackson.annotation.JsonProperty("usageInBytes")
        private Long usageInBytes;

        /**
         * The usage value corresponding to this principal in bytes.
         *
         * @param usageInBytes the value to set
         * @return this builder
         */
        public Builder usageInBytes(Long usageInBytes) {
            this.usageInBytes = usageInBytes;
            this.__explicitlySet__.add("usageInBytes");
            return this;
        }
        /** The value of the quota rule in gigabytes. */
        @com.fasterxml.jackson.annotation.JsonProperty("quotaLimitInGigabytes")
        private Integer quotaLimitInGigabytes;

        /**
         * The value of the quota rule in gigabytes.
         *
         * @param quotaLimitInGigabytes the value to set
         * @return this builder
         */
        public Builder quotaLimitInGigabytes(Integer quotaLimitInGigabytes) {
            this.quotaLimitInGigabytes = quotaLimitInGigabytes;
            this.__explicitlySet__.add("quotaLimitInGigabytes");
            return this;
        }
        /**
         * The date and time the quota rule was created, expressed in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the quota rule was created, expressed in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the quota rule was last updated, expressed in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the quota rule was last updated, expressed in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * An option to display only the users or groups that violate their quota rules. If {@code
         * areViolatorsOnly} is false, results report all the quota and usage. If {@code
         * areViolatorsOnly} is true, results only report the quota and usage for the users or
         * groups that violate their quota rules.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("areViolatorsOnly")
        private Boolean areViolatorsOnly;

        /**
         * An option to display only the users or groups that violate their quota rules. If {@code
         * areViolatorsOnly} is false, results report all the quota and usage. If {@code
         * areViolatorsOnly} is true, results only report the quota and usage for the users or
         * groups that violate their quota rules.
         *
         * @param areViolatorsOnly the value to set
         * @return this builder
         */
        public Builder areViolatorsOnly(Boolean areViolatorsOnly) {
            this.areViolatorsOnly = areViolatorsOnly;
            this.__explicitlySet__.add("areViolatorsOnly");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public QuotaRuleSummary build() {
            QuotaRuleSummary model =
                    new QuotaRuleSummary(
                            this.id,
                            this.fileSystemId,
                            this.principalType,
                            this.principalId,
                            this.isHardQuota,
                            this.displayName,
                            this.usageInBytes,
                            this.quotaLimitInGigabytes,
                            this.timeCreated,
                            this.timeUpdated,
                            this.areViolatorsOnly);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(QuotaRuleSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("fileSystemId")) {
                this.fileSystemId(model.getFileSystemId());
            }
            if (model.wasPropertyExplicitlySet("principalType")) {
                this.principalType(model.getPrincipalType());
            }
            if (model.wasPropertyExplicitlySet("principalId")) {
                this.principalId(model.getPrincipalId());
            }
            if (model.wasPropertyExplicitlySet("isHardQuota")) {
                this.isHardQuota(model.getIsHardQuota());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("usageInBytes")) {
                this.usageInBytes(model.getUsageInBytes());
            }
            if (model.wasPropertyExplicitlySet("quotaLimitInGigabytes")) {
                this.quotaLimitInGigabytes(model.getQuotaLimitInGigabytes());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("areViolatorsOnly")) {
                this.areViolatorsOnly(model.getAreViolatorsOnly());
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
     * The identifier of the quota rule. It is the base64 encoded string of the tuple <principalId,
     * principalType, isHardQuota>.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The identifier of the quota rule. It is the base64 encoded string of the tuple <principalId,
     * principalType, isHardQuota>.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the file
     * system.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fileSystemId")
    private final String fileSystemId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the file
     * system.
     *
     * @return the value
     */
    public String getFileSystemId() {
        return fileSystemId;
    }

    /** The type of the owner of this quota rule and usage. */
    public enum PrincipalType implements com.oracle.bmc.http.internal.BmcEnum {
        FileSystemLevel("FILE_SYSTEM_LEVEL"),
        DefaultGroup("DEFAULT_GROUP"),
        DefaultUser("DEFAULT_USER"),
        IndividualGroup("INDIVIDUAL_GROUP"),
        IndividualUser("INDIVIDUAL_USER"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PrincipalType.class);

        private final String value;
        private static java.util.Map<String, PrincipalType> map;

        static {
            map = new java.util.HashMap<>();
            for (PrincipalType v : PrincipalType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PrincipalType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PrincipalType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PrincipalType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The type of the owner of this quota rule and usage. */
    @com.fasterxml.jackson.annotation.JsonProperty("principalType")
    private final PrincipalType principalType;

    /**
     * The type of the owner of this quota rule and usage.
     *
     * @return the value
     */
    public PrincipalType getPrincipalType() {
        return principalType;
    }

    /**
     * An identifier for the user or the group associated with quota rule and usage. UNIX-like
     * operating systems use this integer value to identify a user or group to manage access
     * control.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("principalId")
    private final Integer principalId;

    /**
     * An identifier for the user or the group associated with quota rule and usage. UNIX-like
     * operating systems use this integer value to identify a user or group to manage access
     * control.
     *
     * @return the value
     */
    public Integer getPrincipalId() {
        return principalId;
    }

    /**
     * Whether the quota rule will be enforced. If {@code isHardQuota} is true, the quota rule is
     * enforced so that the write is blocked if usage exceeds the hard quota limit. If {@code
     * isHardQuota} is false, writes succeed even if usage exceeds the soft quota limit, but the
     * quota rule is violated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isHardQuota")
    private final Boolean isHardQuota;

    /**
     * Whether the quota rule will be enforced. If {@code isHardQuota} is true, the quota rule is
     * enforced so that the write is blocked if usage exceeds the hard quota limit. If {@code
     * isHardQuota} is false, writes succeed even if usage exceeds the soft quota limit, but the
     * quota rule is violated.
     *
     * @return the value
     */
    public Boolean getIsHardQuota() {
        return isHardQuota;
    }

    /**
     * A user-friendly name. It does not have to be unique, and it is changeable. Avoid entering
     * confidential information. Example: {@code UserXYZ's quota}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. It does not have to be unique, and it is changeable. Avoid entering
     * confidential information. Example: {@code UserXYZ's quota}
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The usage value corresponding to this principal in bytes. */
    @com.fasterxml.jackson.annotation.JsonProperty("usageInBytes")
    private final Long usageInBytes;

    /**
     * The usage value corresponding to this principal in bytes.
     *
     * @return the value
     */
    public Long getUsageInBytes() {
        return usageInBytes;
    }

    /** The value of the quota rule in gigabytes. */
    @com.fasterxml.jackson.annotation.JsonProperty("quotaLimitInGigabytes")
    private final Integer quotaLimitInGigabytes;

    /**
     * The value of the quota rule in gigabytes.
     *
     * @return the value
     */
    public Integer getQuotaLimitInGigabytes() {
        return quotaLimitInGigabytes;
    }

    /**
     * The date and time the quota rule was created, expressed in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the quota rule was created, expressed in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the quota rule was last updated, expressed in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the quota rule was last updated, expressed in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * An option to display only the users or groups that violate their quota rules. If {@code
     * areViolatorsOnly} is false, results report all the quota and usage. If {@code
     * areViolatorsOnly} is true, results only report the quota and usage for the users or groups
     * that violate their quota rules.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("areViolatorsOnly")
    private final Boolean areViolatorsOnly;

    /**
     * An option to display only the users or groups that violate their quota rules. If {@code
     * areViolatorsOnly} is false, results report all the quota and usage. If {@code
     * areViolatorsOnly} is true, results only report the quota and usage for the users or groups
     * that violate their quota rules.
     *
     * @return the value
     */
    public Boolean getAreViolatorsOnly() {
        return areViolatorsOnly;
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
        sb.append("QuotaRuleSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", fileSystemId=").append(String.valueOf(this.fileSystemId));
        sb.append(", principalType=").append(String.valueOf(this.principalType));
        sb.append(", principalId=").append(String.valueOf(this.principalId));
        sb.append(", isHardQuota=").append(String.valueOf(this.isHardQuota));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", usageInBytes=").append(String.valueOf(this.usageInBytes));
        sb.append(", quotaLimitInGigabytes=").append(String.valueOf(this.quotaLimitInGigabytes));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", areViolatorsOnly=").append(String.valueOf(this.areViolatorsOnly));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof QuotaRuleSummary)) {
            return false;
        }

        QuotaRuleSummary other = (QuotaRuleSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.fileSystemId, other.fileSystemId)
                && java.util.Objects.equals(this.principalType, other.principalType)
                && java.util.Objects.equals(this.principalId, other.principalId)
                && java.util.Objects.equals(this.isHardQuota, other.isHardQuota)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.usageInBytes, other.usageInBytes)
                && java.util.Objects.equals(this.quotaLimitInGigabytes, other.quotaLimitInGigabytes)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.areViolatorsOnly, other.areViolatorsOnly)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.fileSystemId == null ? 43 : this.fileSystemId.hashCode());
        result =
                (result * PRIME)
                        + (this.principalType == null ? 43 : this.principalType.hashCode());
        result = (result * PRIME) + (this.principalId == null ? 43 : this.principalId.hashCode());
        result = (result * PRIME) + (this.isHardQuota == null ? 43 : this.isHardQuota.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.usageInBytes == null ? 43 : this.usageInBytes.hashCode());
        result =
                (result * PRIME)
                        + (this.quotaLimitInGigabytes == null
                                ? 43
                                : this.quotaLimitInGigabytes.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.areViolatorsOnly == null ? 43 : this.areViolatorsOnly.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

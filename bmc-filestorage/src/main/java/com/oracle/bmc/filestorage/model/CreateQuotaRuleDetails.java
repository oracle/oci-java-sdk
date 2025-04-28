/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.filestorage.model;

/**
 * Details for creating a quota rule in the file system. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateQuotaRuleDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateQuotaRuleDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "principalType",
        "principalId",
        "isHardQuota",
        "displayName",
        "quotaLimitInGigabytes"
    })
    public CreateQuotaRuleDetails(
            PrincipalType principalType,
            Integer principalId,
            Boolean isHardQuota,
            String displayName,
            Integer quotaLimitInGigabytes) {
        super();
        this.principalType = principalType;
        this.principalId = principalId;
        this.isHardQuota = isHardQuota;
        this.displayName = displayName;
        this.quotaLimitInGigabytes = quotaLimitInGigabytes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateQuotaRuleDetails build() {
            CreateQuotaRuleDetails model =
                    new CreateQuotaRuleDetails(
                            this.principalType,
                            this.principalId,
                            this.isHardQuota,
                            this.displayName,
                            this.quotaLimitInGigabytes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateQuotaRuleDetails model) {
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
            if (model.wasPropertyExplicitlySet("quotaLimitInGigabytes")) {
                this.quotaLimitInGigabytes(model.getQuotaLimitInGigabytes());
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

    /** The type of the owner of this quota rule and usage. */
    public enum PrincipalType implements com.oracle.bmc.http.internal.BmcEnum {
        FileSystemLevel("FILE_SYSTEM_LEVEL"),
        DefaultGroup("DEFAULT_GROUP"),
        DefaultUser("DEFAULT_USER"),
        IndividualGroup("INDIVIDUAL_GROUP"),
        IndividualUser("INDIVIDUAL_USER"),
        ;

        private final String value;
        private static java.util.Map<String, PrincipalType> map;

        static {
            map = new java.util.HashMap<>();
            for (PrincipalType v : PrincipalType.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid PrincipalType: " + key);
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
        sb.append("CreateQuotaRuleDetails(");
        sb.append("super=").append(super.toString());
        sb.append("principalType=").append(String.valueOf(this.principalType));
        sb.append(", principalId=").append(String.valueOf(this.principalId));
        sb.append(", isHardQuota=").append(String.valueOf(this.isHardQuota));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", quotaLimitInGigabytes=").append(String.valueOf(this.quotaLimitInGigabytes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateQuotaRuleDetails)) {
            return false;
        }

        CreateQuotaRuleDetails other = (CreateQuotaRuleDetails) o;
        return java.util.Objects.equals(this.principalType, other.principalType)
                && java.util.Objects.equals(this.principalId, other.principalId)
                && java.util.Objects.equals(this.isHardQuota, other.isHardQuota)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.quotaLimitInGigabytes, other.quotaLimitInGigabytes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.principalType == null ? 43 : this.principalType.hashCode());
        result = (result * PRIME) + (this.principalId == null ? 43 : this.principalId.hashCode());
        result = (result * PRIME) + (this.isHardQuota == null ? 43 : this.isHardQuota.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.quotaLimitInGigabytes == null
                                ? 43
                                : this.quotaLimitInGigabytes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

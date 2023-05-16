/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.visualbuilder.model;

/**
 * Description of an attachments for this instance <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AttachmentDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AttachmentDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "targetRole",
        "isImplicit",
        "targetId",
        "targetInstanceUrl",
        "targetServiceType"
    })
    public AttachmentDetails(
            TargetRole targetRole,
            Boolean isImplicit,
            String targetId,
            String targetInstanceUrl,
            String targetServiceType) {
        super();
        this.targetRole = targetRole;
        this.isImplicit = isImplicit;
        this.targetId = targetId;
        this.targetInstanceUrl = targetInstanceUrl;
        this.targetServiceType = targetServiceType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The role of the target attachment. * {@code PARENT} - The target instance is the parent
         * of this attachment. * {@code CHILD} - The target instance is the child of this
         * attachment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targetRole")
        private TargetRole targetRole;

        /**
         * The role of the target attachment. * {@code PARENT} - The target instance is the parent
         * of this attachment. * {@code CHILD} - The target instance is the child of this
         * attachment.
         *
         * @param targetRole the value to set
         * @return this builder
         */
        public Builder targetRole(TargetRole targetRole) {
            this.targetRole = targetRole;
            this.__explicitlySet__.add("targetRole");
            return this;
        }
        /**
         * * If role == {@code PARENT}, the attached instance was created by this service instance *
         * If role == {@code CHILD}, this instance was created from attached instance on behalf of a
         * user
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isImplicit")
        private Boolean isImplicit;

        /**
         * * If role == {@code PARENT}, the attached instance was created by this service instance *
         * If role == {@code CHILD}, this instance was created from attached instance on behalf of a
         * user
         *
         * @param isImplicit the value to set
         * @return this builder
         */
        public Builder isImplicit(Boolean isImplicit) {
            this.isImplicit = isImplicit;
            this.__explicitlySet__.add("isImplicit");
            return this;
        }
        /**
         * The OCID of the target instance (which could be any other OCI PaaS/SaaS resource), to
         * which this instance is attached.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * The OCID of the target instance (which could be any other OCI PaaS/SaaS resource), to
         * which this instance is attached.
         *
         * @param targetId the value to set
         * @return this builder
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /** The dataplane instance URL of the attached instance */
        @com.fasterxml.jackson.annotation.JsonProperty("targetInstanceUrl")
        private String targetInstanceUrl;

        /**
         * The dataplane instance URL of the attached instance
         *
         * @param targetInstanceUrl the value to set
         * @return this builder
         */
        public Builder targetInstanceUrl(String targetInstanceUrl) {
            this.targetInstanceUrl = targetInstanceUrl;
            this.__explicitlySet__.add("targetInstanceUrl");
            return this;
        }
        /** The type of the target instance, such as "FUSION". */
        @com.fasterxml.jackson.annotation.JsonProperty("targetServiceType")
        private String targetServiceType;

        /**
         * The type of the target instance, such as "FUSION".
         *
         * @param targetServiceType the value to set
         * @return this builder
         */
        public Builder targetServiceType(String targetServiceType) {
            this.targetServiceType = targetServiceType;
            this.__explicitlySet__.add("targetServiceType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AttachmentDetails build() {
            AttachmentDetails model =
                    new AttachmentDetails(
                            this.targetRole,
                            this.isImplicit,
                            this.targetId,
                            this.targetInstanceUrl,
                            this.targetServiceType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AttachmentDetails model) {
            if (model.wasPropertyExplicitlySet("targetRole")) {
                this.targetRole(model.getTargetRole());
            }
            if (model.wasPropertyExplicitlySet("isImplicit")) {
                this.isImplicit(model.getIsImplicit());
            }
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
            }
            if (model.wasPropertyExplicitlySet("targetInstanceUrl")) {
                this.targetInstanceUrl(model.getTargetInstanceUrl());
            }
            if (model.wasPropertyExplicitlySet("targetServiceType")) {
                this.targetServiceType(model.getTargetServiceType());
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
     * The role of the target attachment. * {@code PARENT} - The target instance is the parent of
     * this attachment. * {@code CHILD} - The target instance is the child of this attachment.
     */
    public enum TargetRole implements com.oracle.bmc.http.internal.BmcEnum {
        Parent("PARENT"),
        Child("CHILD"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(TargetRole.class);

        private final String value;
        private static java.util.Map<String, TargetRole> map;

        static {
            map = new java.util.HashMap<>();
            for (TargetRole v : TargetRole.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TargetRole(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TargetRole create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TargetRole', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The role of the target attachment. * {@code PARENT} - The target instance is the parent of
     * this attachment. * {@code CHILD} - The target instance is the child of this attachment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetRole")
    private final TargetRole targetRole;

    /**
     * The role of the target attachment. * {@code PARENT} - The target instance is the parent of
     * this attachment. * {@code CHILD} - The target instance is the child of this attachment.
     *
     * @return the value
     */
    public TargetRole getTargetRole() {
        return targetRole;
    }

    /**
     * * If role == {@code PARENT}, the attached instance was created by this service instance * If
     * role == {@code CHILD}, this instance was created from attached instance on behalf of a user
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isImplicit")
    private final Boolean isImplicit;

    /**
     * * If role == {@code PARENT}, the attached instance was created by this service instance * If
     * role == {@code CHILD}, this instance was created from attached instance on behalf of a user
     *
     * @return the value
     */
    public Boolean getIsImplicit() {
        return isImplicit;
    }

    /**
     * The OCID of the target instance (which could be any other OCI PaaS/SaaS resource), to which
     * this instance is attached.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * The OCID of the target instance (which could be any other OCI PaaS/SaaS resource), to which
     * this instance is attached.
     *
     * @return the value
     */
    public String getTargetId() {
        return targetId;
    }

    /** The dataplane instance URL of the attached instance */
    @com.fasterxml.jackson.annotation.JsonProperty("targetInstanceUrl")
    private final String targetInstanceUrl;

    /**
     * The dataplane instance URL of the attached instance
     *
     * @return the value
     */
    public String getTargetInstanceUrl() {
        return targetInstanceUrl;
    }

    /** The type of the target instance, such as "FUSION". */
    @com.fasterxml.jackson.annotation.JsonProperty("targetServiceType")
    private final String targetServiceType;

    /**
     * The type of the target instance, such as "FUSION".
     *
     * @return the value
     */
    public String getTargetServiceType() {
        return targetServiceType;
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
        sb.append("AttachmentDetails(");
        sb.append("super=").append(super.toString());
        sb.append("targetRole=").append(String.valueOf(this.targetRole));
        sb.append(", isImplicit=").append(String.valueOf(this.isImplicit));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(", targetInstanceUrl=").append(String.valueOf(this.targetInstanceUrl));
        sb.append(", targetServiceType=").append(String.valueOf(this.targetServiceType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AttachmentDetails)) {
            return false;
        }

        AttachmentDetails other = (AttachmentDetails) o;
        return java.util.Objects.equals(this.targetRole, other.targetRole)
                && java.util.Objects.equals(this.isImplicit, other.isImplicit)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.targetInstanceUrl, other.targetInstanceUrl)
                && java.util.Objects.equals(this.targetServiceType, other.targetServiceType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.targetRole == null ? 43 : this.targetRole.hashCode());
        result = (result * PRIME) + (this.isImplicit == null ? 43 : this.isImplicit.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result =
                (result * PRIME)
                        + (this.targetInstanceUrl == null ? 43 : this.targetInstanceUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.targetServiceType == null ? 43 : this.targetServiceType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

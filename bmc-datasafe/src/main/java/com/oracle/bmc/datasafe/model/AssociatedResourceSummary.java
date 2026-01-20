/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Summary details of the associated resource of an attribute set. <br>
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
        builder = AssociatedResourceSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AssociatedResourceSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "associatedResourceType",
        "associatedResourceId",
        "associatedResourceName",
        "timeCreated",
        "timeUpdated"
    })
    public AssociatedResourceSummary(
            AssociatedResourceType associatedResourceType,
            String associatedResourceId,
            String associatedResourceName,
            java.util.Date timeCreated,
            java.util.Date timeUpdated) {
        super();
        this.associatedResourceType = associatedResourceType;
        this.associatedResourceId = associatedResourceId;
        this.associatedResourceName = associatedResourceName;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The resource type that is associated with the attribute set. */
        @com.fasterxml.jackson.annotation.JsonProperty("associatedResourceType")
        private AssociatedResourceType associatedResourceType;

        /**
         * The resource type that is associated with the attribute set.
         *
         * @param associatedResourceType the value to set
         * @return this builder
         */
        public Builder associatedResourceType(AssociatedResourceType associatedResourceType) {
            this.associatedResourceType = associatedResourceType;
            this.__explicitlySet__.add("associatedResourceType");
            return this;
        }
        /** The OCID of the resource that is associated with the attribute set. */
        @com.fasterxml.jackson.annotation.JsonProperty("associatedResourceId")
        private String associatedResourceId;

        /**
         * The OCID of the resource that is associated with the attribute set.
         *
         * @param associatedResourceId the value to set
         * @return this builder
         */
        public Builder associatedResourceId(String associatedResourceId) {
            this.associatedResourceId = associatedResourceId;
            this.__explicitlySet__.add("associatedResourceId");
            return this;
        }
        /**
         * The display name of the resource that is associated with the attribute set. The name does
         * not have to be unique, and is changeable.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("associatedResourceName")
        private String associatedResourceName;

        /**
         * The display name of the resource that is associated with the attribute set. The name does
         * not have to be unique, and is changeable.
         *
         * @param associatedResourceName the value to set
         * @return this builder
         */
        public Builder associatedResourceName(String associatedResourceName) {
            this.associatedResourceName = associatedResourceName;
            this.__explicitlySet__.add("associatedResourceName");
            return this;
        }
        /**
         * The date and time when associated started between resource and the attribute set, in the
         * format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time when associated started between resource and the attribute set, in the
         * format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
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
         * The date and time when associated is removed between resources and the attribute set, in
         * the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time when associated is removed between resources and the attribute set, in
         * the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AssociatedResourceSummary build() {
            AssociatedResourceSummary model =
                    new AssociatedResourceSummary(
                            this.associatedResourceType,
                            this.associatedResourceId,
                            this.associatedResourceName,
                            this.timeCreated,
                            this.timeUpdated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AssociatedResourceSummary model) {
            if (model.wasPropertyExplicitlySet("associatedResourceType")) {
                this.associatedResourceType(model.getAssociatedResourceType());
            }
            if (model.wasPropertyExplicitlySet("associatedResourceId")) {
                this.associatedResourceId(model.getAssociatedResourceId());
            }
            if (model.wasPropertyExplicitlySet("associatedResourceName")) {
                this.associatedResourceName(model.getAssociatedResourceName());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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

    /** The resource type that is associated with the attribute set. */
    public enum AssociatedResourceType implements com.oracle.bmc.http.internal.BmcEnum {
        AuditPolicy("AUDIT_POLICY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AssociatedResourceType.class);

        private final String value;
        private static java.util.Map<String, AssociatedResourceType> map;

        static {
            map = new java.util.HashMap<>();
            for (AssociatedResourceType v : AssociatedResourceType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AssociatedResourceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AssociatedResourceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AssociatedResourceType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The resource type that is associated with the attribute set. */
    @com.fasterxml.jackson.annotation.JsonProperty("associatedResourceType")
    private final AssociatedResourceType associatedResourceType;

    /**
     * The resource type that is associated with the attribute set.
     *
     * @return the value
     */
    public AssociatedResourceType getAssociatedResourceType() {
        return associatedResourceType;
    }

    /** The OCID of the resource that is associated with the attribute set. */
    @com.fasterxml.jackson.annotation.JsonProperty("associatedResourceId")
    private final String associatedResourceId;

    /**
     * The OCID of the resource that is associated with the attribute set.
     *
     * @return the value
     */
    public String getAssociatedResourceId() {
        return associatedResourceId;
    }

    /**
     * The display name of the resource that is associated with the attribute set. The name does not
     * have to be unique, and is changeable.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("associatedResourceName")
    private final String associatedResourceName;

    /**
     * The display name of the resource that is associated with the attribute set. The name does not
     * have to be unique, and is changeable.
     *
     * @return the value
     */
    public String getAssociatedResourceName() {
        return associatedResourceName;
    }

    /**
     * The date and time when associated started between resource and the attribute set, in the
     * format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time when associated started between resource and the attribute set, in the
     * format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time when associated is removed between resources and the attribute set, in the
     * format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time when associated is removed between resources and the attribute set, in the
     * format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
        sb.append("AssociatedResourceSummary(");
        sb.append("super=").append(super.toString());
        sb.append("associatedResourceType=").append(String.valueOf(this.associatedResourceType));
        sb.append(", associatedResourceId=").append(String.valueOf(this.associatedResourceId));
        sb.append(", associatedResourceName=").append(String.valueOf(this.associatedResourceName));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AssociatedResourceSummary)) {
            return false;
        }

        AssociatedResourceSummary other = (AssociatedResourceSummary) o;
        return java.util.Objects.equals(this.associatedResourceType, other.associatedResourceType)
                && java.util.Objects.equals(this.associatedResourceId, other.associatedResourceId)
                && java.util.Objects.equals(
                        this.associatedResourceName, other.associatedResourceName)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.associatedResourceType == null
                                ? 43
                                : this.associatedResourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.associatedResourceId == null
                                ? 43
                                : this.associatedResourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.associatedResourceName == null
                                ? 43
                                : this.associatedResourceName.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

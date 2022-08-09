/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * Get summary information about pre-authenticated requests.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = PreauthenticatedRequestSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PreauthenticatedRequestSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "name",
        "objectName",
        "bucketListingAction",
        "accessType",
        "timeExpires",
        "timeCreated"
    })
    public PreauthenticatedRequestSummary(
            String id,
            String name,
            String objectName,
            PreauthenticatedRequest.BucketListingAction bucketListingAction,
            AccessType accessType,
            java.util.Date timeExpires,
            java.util.Date timeCreated) {
        super();
        this.id = id;
        this.name = name;
        this.objectName = objectName;
        this.bucketListingAction = bucketListingAction;
        this.accessType = accessType;
        this.timeExpires = timeExpires;
        this.timeCreated = timeCreated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique identifier to use when directly addressing the pre-authenticated request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The unique identifier to use when directly addressing the pre-authenticated request.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The user-provided name of the pre-authenticated request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The user-provided name of the pre-authenticated request.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The name of object that is being granted access to by the pre-authenticated request. This can be null and if it is,
         * the pre-authenticated request grants access to the entire bucket.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectName")
        private String objectName;

        /**
         * The name of object that is being granted access to by the pre-authenticated request. This can be null and if it is,
         * the pre-authenticated request grants access to the entire bucket.
         *
         * @param objectName the value to set
         * @return this builder
         **/
        public Builder objectName(String objectName) {
            this.objectName = objectName;
            this.__explicitlySet__.add("objectName");
            return this;
        }
        /**
         * Specifies whether a list operation is allowed on a PAR with accessType "AnyObjectRead" or "AnyObjectReadWrite".
         * Deny: Prevents the user from performing a list operation.
         * ListObjects: Authorizes the user to perform a list operation.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bucketListingAction")
        private PreauthenticatedRequest.BucketListingAction bucketListingAction;

        /**
         * Specifies whether a list operation is allowed on a PAR with accessType "AnyObjectRead" or "AnyObjectReadWrite".
         * Deny: Prevents the user from performing a list operation.
         * ListObjects: Authorizes the user to perform a list operation.
         *
         * @param bucketListingAction the value to set
         * @return this builder
         **/
        public Builder bucketListingAction(
                PreauthenticatedRequest.BucketListingAction bucketListingAction) {
            this.bucketListingAction = bucketListingAction;
            this.__explicitlySet__.add("bucketListingAction");
            return this;
        }
        /**
         * The operation that can be performed on this resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("accessType")
        private AccessType accessType;

        /**
         * The operation that can be performed on this resource.
         * @param accessType the value to set
         * @return this builder
         **/
        public Builder accessType(AccessType accessType) {
            this.accessType = accessType;
            this.__explicitlySet__.add("accessType");
            return this;
        }
        /**
         * The expiration date for the pre-authenticated request as per [RFC 3339](https://tools.ietf.org/html/rfc3339). After this date the pre-authenticated request will no longer be valid.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeExpires")
        private java.util.Date timeExpires;

        /**
         * The expiration date for the pre-authenticated request as per [RFC 3339](https://tools.ietf.org/html/rfc3339). After this date the pre-authenticated request will no longer be valid.
         *
         * @param timeExpires the value to set
         * @return this builder
         **/
        public Builder timeExpires(java.util.Date timeExpires) {
            this.timeExpires = timeExpires;
            this.__explicitlySet__.add("timeExpires");
            return this;
        }
        /**
         * The date when the pre-authenticated request was created as per [RFC 3339](https://tools.ietf.org/html/rfc3339).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date when the pre-authenticated request was created as per [RFC 3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PreauthenticatedRequestSummary build() {
            PreauthenticatedRequestSummary model =
                    new PreauthenticatedRequestSummary(
                            this.id,
                            this.name,
                            this.objectName,
                            this.bucketListingAction,
                            this.accessType,
                            this.timeExpires,
                            this.timeCreated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PreauthenticatedRequestSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("objectName")) {
                this.objectName(model.getObjectName());
            }
            if (model.wasPropertyExplicitlySet("bucketListingAction")) {
                this.bucketListingAction(model.getBucketListingAction());
            }
            if (model.wasPropertyExplicitlySet("accessType")) {
                this.accessType(model.getAccessType());
            }
            if (model.wasPropertyExplicitlySet("timeExpires")) {
                this.timeExpires(model.getTimeExpires());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
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
     * The unique identifier to use when directly addressing the pre-authenticated request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The unique identifier to use when directly addressing the pre-authenticated request.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The user-provided name of the pre-authenticated request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The user-provided name of the pre-authenticated request.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The name of object that is being granted access to by the pre-authenticated request. This can be null and if it is,
     * the pre-authenticated request grants access to the entire bucket.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    private final String objectName;

    /**
     * The name of object that is being granted access to by the pre-authenticated request. This can be null and if it is,
     * the pre-authenticated request grants access to the entire bucket.
     *
     * @return the value
     **/
    public String getObjectName() {
        return objectName;
    }

    /**
     * Specifies whether a list operation is allowed on a PAR with accessType "AnyObjectRead" or "AnyObjectReadWrite".
     * Deny: Prevents the user from performing a list operation.
     * ListObjects: Authorizes the user to perform a list operation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bucketListingAction")
    private final PreauthenticatedRequest.BucketListingAction bucketListingAction;

    /**
     * Specifies whether a list operation is allowed on a PAR with accessType "AnyObjectRead" or "AnyObjectReadWrite".
     * Deny: Prevents the user from performing a list operation.
     * ListObjects: Authorizes the user to perform a list operation.
     *
     * @return the value
     **/
    public PreauthenticatedRequest.BucketListingAction getBucketListingAction() {
        return bucketListingAction;
    }

    /**
     * The operation that can be performed on this resource.
     **/
    public enum AccessType {
        ObjectRead("ObjectRead"),
        ObjectWrite("ObjectWrite"),
        ObjectReadWrite("ObjectReadWrite"),
        AnyObjectWrite("AnyObjectWrite"),
        AnyObjectRead("AnyObjectRead"),
        AnyObjectReadWrite("AnyObjectReadWrite"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AccessType.class);

        private final String value;
        private static java.util.Map<String, AccessType> map;

        static {
            map = new java.util.HashMap<>();
            for (AccessType v : AccessType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AccessType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AccessType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AccessType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The operation that can be performed on this resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("accessType")
    private final AccessType accessType;

    /**
     * The operation that can be performed on this resource.
     * @return the value
     **/
    public AccessType getAccessType() {
        return accessType;
    }

    /**
     * The expiration date for the pre-authenticated request as per [RFC 3339](https://tools.ietf.org/html/rfc3339). After this date the pre-authenticated request will no longer be valid.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeExpires")
    private final java.util.Date timeExpires;

    /**
     * The expiration date for the pre-authenticated request as per [RFC 3339](https://tools.ietf.org/html/rfc3339). After this date the pre-authenticated request will no longer be valid.
     *
     * @return the value
     **/
    public java.util.Date getTimeExpires() {
        return timeExpires;
    }

    /**
     * The date when the pre-authenticated request was created as per [RFC 3339](https://tools.ietf.org/html/rfc3339).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date when the pre-authenticated request was created as per [RFC 3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
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
        sb.append("PreauthenticatedRequestSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", objectName=").append(String.valueOf(this.objectName));
        sb.append(", bucketListingAction=").append(String.valueOf(this.bucketListingAction));
        sb.append(", accessType=").append(String.valueOf(this.accessType));
        sb.append(", timeExpires=").append(String.valueOf(this.timeExpires));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PreauthenticatedRequestSummary)) {
            return false;
        }

        PreauthenticatedRequestSummary other = (PreauthenticatedRequestSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.objectName, other.objectName)
                && java.util.Objects.equals(this.bucketListingAction, other.bucketListingAction)
                && java.util.Objects.equals(this.accessType, other.accessType)
                && java.util.Objects.equals(this.timeExpires, other.timeExpires)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.objectName == null ? 43 : this.objectName.hashCode());
        result =
                (result * PRIME)
                        + (this.bucketListingAction == null
                                ? 43
                                : this.bucketListingAction.hashCode());
        result = (result * PRIME) + (this.accessType == null ? 43 : this.accessType.hashCode());
        result = (result * PRIME) + (this.timeExpires == null ? 43 : this.timeExpires.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

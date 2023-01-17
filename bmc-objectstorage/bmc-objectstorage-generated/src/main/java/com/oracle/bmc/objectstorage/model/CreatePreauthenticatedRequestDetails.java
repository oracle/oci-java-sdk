/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreatePreauthenticatedRequestDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CreatePreauthenticatedRequestDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "bucketListingAction",
        "objectName",
        "accessType",
        "timeExpires"
    })
    public CreatePreauthenticatedRequestDetails(
            String name,
            PreauthenticatedRequest.BucketListingAction bucketListingAction,
            String objectName,
            AccessType accessType,
            java.util.Date timeExpires) {
        super();
        this.name = name;
        this.bucketListingAction = bucketListingAction;
        this.objectName = objectName;
        this.accessType = accessType;
        this.timeExpires = timeExpires;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A user-specified name for the pre-authenticated request. Names can be helpful in managing
         * pre-authenticated requests. Avoid entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * A user-specified name for the pre-authenticated request. Names can be helpful in managing
         * pre-authenticated requests. Avoid entering confidential information.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Specifies whether a list operation is allowed on a PAR with accessType "AnyObjectRead" or
         * "AnyObjectReadWrite". Deny: Prevents the user from performing a list operation.
         * ListObjects: Authorizes the user to perform a list operation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("bucketListingAction")
        private PreauthenticatedRequest.BucketListingAction bucketListingAction;

        /**
         * Specifies whether a list operation is allowed on a PAR with accessType "AnyObjectRead" or
         * "AnyObjectReadWrite". Deny: Prevents the user from performing a list operation.
         * ListObjects: Authorizes the user to perform a list operation.
         *
         * @param bucketListingAction the value to set
         * @return this builder
         */
        public Builder bucketListingAction(
                PreauthenticatedRequest.BucketListingAction bucketListingAction) {
            this.bucketListingAction = bucketListingAction;
            this.__explicitlySet__.add("bucketListingAction");
            return this;
        }
        /**
         * The name of the object that is being granted access to by the pre-authenticated request.
         * Avoid entering confidential information. The object name can be null and if so, the
         * pre-authenticated request grants access to the entire bucket if the access type allows
         * that. The object name can be a prefix as well, in that case pre-authenticated request
         * grants access to all the objects within the bucket starting with that prefix provided
         * that we have the correct access type.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("objectName")
        private String objectName;

        /**
         * The name of the object that is being granted access to by the pre-authenticated request.
         * Avoid entering confidential information. The object name can be null and if so, the
         * pre-authenticated request grants access to the entire bucket if the access type allows
         * that. The object name can be a prefix as well, in that case pre-authenticated request
         * grants access to all the objects within the bucket starting with that prefix provided
         * that we have the correct access type.
         *
         * @param objectName the value to set
         * @return this builder
         */
        public Builder objectName(String objectName) {
            this.objectName = objectName;
            this.__explicitlySet__.add("objectName");
            return this;
        }
        /** The operation that can be performed on this resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("accessType")
        private AccessType accessType;

        /**
         * The operation that can be performed on this resource.
         *
         * @param accessType the value to set
         * @return this builder
         */
        public Builder accessType(AccessType accessType) {
            this.accessType = accessType;
            this.__explicitlySet__.add("accessType");
            return this;
        }
        /**
         * The expiration date for the pre-authenticated request as per [RFC
         * 3339](https://tools.ietf.org/html/rfc3339). After this date the pre-authenticated request
         * will no longer be valid.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeExpires")
        private java.util.Date timeExpires;

        /**
         * The expiration date for the pre-authenticated request as per [RFC
         * 3339](https://tools.ietf.org/html/rfc3339). After this date the pre-authenticated request
         * will no longer be valid.
         *
         * @param timeExpires the value to set
         * @return this builder
         */
        public Builder timeExpires(java.util.Date timeExpires) {
            this.timeExpires = timeExpires;
            this.__explicitlySet__.add("timeExpires");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreatePreauthenticatedRequestDetails build() {
            CreatePreauthenticatedRequestDetails model =
                    new CreatePreauthenticatedRequestDetails(
                            this.name,
                            this.bucketListingAction,
                            this.objectName,
                            this.accessType,
                            this.timeExpires);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreatePreauthenticatedRequestDetails model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("bucketListingAction")) {
                this.bucketListingAction(model.getBucketListingAction());
            }
            if (model.wasPropertyExplicitlySet("objectName")) {
                this.objectName(model.getObjectName());
            }
            if (model.wasPropertyExplicitlySet("accessType")) {
                this.accessType(model.getAccessType());
            }
            if (model.wasPropertyExplicitlySet("timeExpires")) {
                this.timeExpires(model.getTimeExpires());
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
     * A user-specified name for the pre-authenticated request. Names can be helpful in managing
     * pre-authenticated requests. Avoid entering confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * A user-specified name for the pre-authenticated request. Names can be helpful in managing
     * pre-authenticated requests. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * Specifies whether a list operation is allowed on a PAR with accessType "AnyObjectRead" or
     * "AnyObjectReadWrite". Deny: Prevents the user from performing a list operation. ListObjects:
     * Authorizes the user to perform a list operation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bucketListingAction")
    private final PreauthenticatedRequest.BucketListingAction bucketListingAction;

    /**
     * Specifies whether a list operation is allowed on a PAR with accessType "AnyObjectRead" or
     * "AnyObjectReadWrite". Deny: Prevents the user from performing a list operation. ListObjects:
     * Authorizes the user to perform a list operation.
     *
     * @return the value
     */
    public PreauthenticatedRequest.BucketListingAction getBucketListingAction() {
        return bucketListingAction;
    }

    /**
     * The name of the object that is being granted access to by the pre-authenticated request.
     * Avoid entering confidential information. The object name can be null and if so, the
     * pre-authenticated request grants access to the entire bucket if the access type allows that.
     * The object name can be a prefix as well, in that case pre-authenticated request grants access
     * to all the objects within the bucket starting with that prefix provided that we have the
     * correct access type.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    private final String objectName;

    /**
     * The name of the object that is being granted access to by the pre-authenticated request.
     * Avoid entering confidential information. The object name can be null and if so, the
     * pre-authenticated request grants access to the entire bucket if the access type allows that.
     * The object name can be a prefix as well, in that case pre-authenticated request grants access
     * to all the objects within the bucket starting with that prefix provided that we have the
     * correct access type.
     *
     * @return the value
     */
    public String getObjectName() {
        return objectName;
    }

    /** The operation that can be performed on this resource. */
    public enum AccessType implements com.oracle.bmc.http.internal.BmcEnum {
        ObjectRead("ObjectRead"),
        ObjectWrite("ObjectWrite"),
        ObjectReadWrite("ObjectReadWrite"),
        AnyObjectWrite("AnyObjectWrite"),
        AnyObjectRead("AnyObjectRead"),
        AnyObjectReadWrite("AnyObjectReadWrite"),
        ;

        private final String value;
        private static java.util.Map<String, AccessType> map;

        static {
            map = new java.util.HashMap<>();
            for (AccessType v : AccessType.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid AccessType: " + key);
        }
    };
    /** The operation that can be performed on this resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("accessType")
    private final AccessType accessType;

    /**
     * The operation that can be performed on this resource.
     *
     * @return the value
     */
    public AccessType getAccessType() {
        return accessType;
    }

    /**
     * The expiration date for the pre-authenticated request as per [RFC
     * 3339](https://tools.ietf.org/html/rfc3339). After this date the pre-authenticated request
     * will no longer be valid.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeExpires")
    private final java.util.Date timeExpires;

    /**
     * The expiration date for the pre-authenticated request as per [RFC
     * 3339](https://tools.ietf.org/html/rfc3339). After this date the pre-authenticated request
     * will no longer be valid.
     *
     * @return the value
     */
    public java.util.Date getTimeExpires() {
        return timeExpires;
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
        sb.append("CreatePreauthenticatedRequestDetails(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", bucketListingAction=").append(String.valueOf(this.bucketListingAction));
        sb.append(", objectName=").append(String.valueOf(this.objectName));
        sb.append(", accessType=").append(String.valueOf(this.accessType));
        sb.append(", timeExpires=").append(String.valueOf(this.timeExpires));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreatePreauthenticatedRequestDetails)) {
            return false;
        }

        CreatePreauthenticatedRequestDetails other = (CreatePreauthenticatedRequestDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.bucketListingAction, other.bucketListingAction)
                && java.util.Objects.equals(this.objectName, other.objectName)
                && java.util.Objects.equals(this.accessType, other.accessType)
                && java.util.Objects.equals(this.timeExpires, other.timeExpires)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.bucketListingAction == null
                                ? 43
                                : this.bucketListingAction.hashCode());
        result = (result * PRIME) + (this.objectName == null ? 43 : this.objectName.hashCode());
        result = (result * PRIME) + (this.accessType == null ? 43 : this.accessType.hashCode());
        result = (result * PRIME) + (this.timeExpires == null ? 43 : this.timeExpires.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

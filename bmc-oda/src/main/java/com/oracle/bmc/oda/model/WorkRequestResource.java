/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * A resource created or operated on by a work request.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = WorkRequestResource.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class WorkRequestResource extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "resourceAction",
        "resourceType",
        "resourceId",
        "status",
        "statusMessage",
        "resourceUri"
    })
    public WorkRequestResource(
            ResourceAction resourceAction,
            String resourceType,
            String resourceId,
            Status status,
            String statusMessage,
            String resourceUri) {
        super();
        this.resourceAction = resourceAction;
        this.resourceType = resourceType;
        this.resourceId = resourceId;
        this.status = status;
        this.statusMessage = statusMessage;
        this.resourceUri = resourceUri;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The action to take against the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceAction")
        private ResourceAction resourceAction;

        /**
         * The action to take against the resource.
         * @param resourceAction the value to set
         * @return this builder
         **/
        public Builder resourceAction(ResourceAction resourceAction) {
            this.resourceAction = resourceAction;
            this.__explicitlySet__.add("resourceAction");
            return this;
        }
        /**
         * The resource type that the work request affects.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private String resourceType;

        /**
         * The resource type that the work request affects.
         * @param resourceType the value to set
         * @return this builder
         **/
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /**
         * The identifier of the resource that is the subject of the request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * The identifier of the resource that is the subject of the request.
         * @param resourceId the value to set
         * @return this builder
         **/
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }
        /**
         * The current state of the work request. The {@code SUCCEEDED}, {@code FAILED}, AND {@code CANCELED} states
         * correspond to the action being performed.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * The current state of the work request. The {@code SUCCEEDED}, {@code FAILED}, AND {@code CANCELED} states
         * correspond to the action being performed.
         *
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * Short message providing more detail for the current status. For example, if an operation fails
         * this may include information about the reason for the failure and a possible resolution.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("statusMessage")
        private String statusMessage;

        /**
         * Short message providing more detail for the current status. For example, if an operation fails
         * this may include information about the reason for the failure and a possible resolution.
         *
         * @param statusMessage the value to set
         * @return this builder
         **/
        public Builder statusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            this.__explicitlySet__.add("statusMessage");
            return this;
        }
        /**
         * The URI path that the user can do a GET on to access the resource metadata.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceUri")
        private String resourceUri;

        /**
         * The URI path that the user can do a GET on to access the resource metadata.
         * @param resourceUri the value to set
         * @return this builder
         **/
        public Builder resourceUri(String resourceUri) {
            this.resourceUri = resourceUri;
            this.__explicitlySet__.add("resourceUri");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WorkRequestResource build() {
            WorkRequestResource model =
                    new WorkRequestResource(
                            this.resourceAction,
                            this.resourceType,
                            this.resourceId,
                            this.status,
                            this.statusMessage,
                            this.resourceUri);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WorkRequestResource model) {
            if (model.wasPropertyExplicitlySet("resourceAction")) {
                this.resourceAction(model.getResourceAction());
            }
            if (model.wasPropertyExplicitlySet("resourceType")) {
                this.resourceType(model.getResourceType());
            }
            if (model.wasPropertyExplicitlySet("resourceId")) {
                this.resourceId(model.getResourceId());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("statusMessage")) {
                this.statusMessage(model.getStatusMessage());
            }
            if (model.wasPropertyExplicitlySet("resourceUri")) {
                this.resourceUri(model.getResourceUri());
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
     * The action to take against the resource.
     **/
    public enum ResourceAction {
        Create("CREATE"),
        Update("UPDATE"),
        Delete("DELETE"),
        Purge("PURGE"),
        Recover("RECOVER"),
        Stop("STOP"),
        Start("START"),
        ChangeCompartment("CHANGE_COMPARTMENT"),
        ChangeCustEncKey("CHANGE_CUST_ENC_KEY"),
        DeactCustEncKey("DEACT_CUST_ENC_KEY"),
        CreateAssociation("CREATE_ASSOCIATION"),
        DeleteAssociation("DELETE_ASSOCIATION"),
        UpdateEntitlementsForCacct("UPDATE_ENTITLEMENTS_FOR_CACCT"),
        CreateOdaInstanceAttachment("CREATE_ODA_INSTANCE_ATTACHMENT"),
        UpdateOdaInstanceAttachment("UPDATE_ODA_INSTANCE_ATTACHMENT"),
        DeleteOdaInstanceAttachment("DELETE_ODA_INSTANCE_ATTACHMENT"),
        CreateImportedPackage("CREATE_IMPORTED_PACKAGE"),
        UpdateImportedPackage("UPDATE_IMPORTED_PACKAGE"),
        DeleteImportedPackage("DELETE_IMPORTED_PACKAGE"),
        Export("EXPORT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ResourceAction.class);

        private final String value;
        private static java.util.Map<String, ResourceAction> map;

        static {
            map = new java.util.HashMap<>();
            for (ResourceAction v : ResourceAction.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ResourceAction(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ResourceAction create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ResourceAction', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The action to take against the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceAction")
    private final ResourceAction resourceAction;

    /**
     * The action to take against the resource.
     * @return the value
     **/
    public ResourceAction getResourceAction() {
        return resourceAction;
    }

    /**
     * The resource type that the work request affects.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final String resourceType;

    /**
     * The resource type that the work request affects.
     * @return the value
     **/
    public String getResourceType() {
        return resourceType;
    }

    /**
     * The identifier of the resource that is the subject of the request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * The identifier of the resource that is the subject of the request.
     * @return the value
     **/
    public String getResourceId() {
        return resourceId;
    }

    /**
     * The current state of the work request. The {@code SUCCEEDED}, {@code FAILED}, AND {@code CANCELED} states
     * correspond to the action being performed.
     *
     **/
    public enum Status {
        Accepted("ACCEPTED"),
        InProgress("IN_PROGRESS"),
        Succeeded("SUCCEEDED"),
        Failed("FAILED"),
        Canceling("CANCELING"),
        Canceled("CANCELED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The current state of the work request. The {@code SUCCEEDED}, {@code FAILED}, AND {@code CANCELED} states
     * correspond to the action being performed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * The current state of the work request. The {@code SUCCEEDED}, {@code FAILED}, AND {@code CANCELED} states
     * correspond to the action being performed.
     *
     * @return the value
     **/
    public Status getStatus() {
        return status;
    }

    /**
     * Short message providing more detail for the current status. For example, if an operation fails
     * this may include information about the reason for the failure and a possible resolution.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("statusMessage")
    private final String statusMessage;

    /**
     * Short message providing more detail for the current status. For example, if an operation fails
     * this may include information about the reason for the failure and a possible resolution.
     *
     * @return the value
     **/
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * The URI path that the user can do a GET on to access the resource metadata.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceUri")
    private final String resourceUri;

    /**
     * The URI path that the user can do a GET on to access the resource metadata.
     * @return the value
     **/
    public String getResourceUri() {
        return resourceUri;
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
        sb.append("WorkRequestResource(");
        sb.append("super=").append(super.toString());
        sb.append("resourceAction=").append(String.valueOf(this.resourceAction));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", statusMessage=").append(String.valueOf(this.statusMessage));
        sb.append(", resourceUri=").append(String.valueOf(this.resourceUri));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WorkRequestResource)) {
            return false;
        }

        WorkRequestResource other = (WorkRequestResource) o;
        return java.util.Objects.equals(this.resourceAction, other.resourceAction)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.statusMessage, other.statusMessage)
                && java.util.Objects.equals(this.resourceUri, other.resourceUri)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.resourceAction == null ? 43 : this.resourceAction.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.statusMessage == null ? 43 : this.statusMessage.hashCode());
        result = (result * PRIME) + (this.resourceUri == null ? 43 : this.resourceUri.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * A description of the work request's status.
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
    builder = WorkRequestSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class WorkRequestSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "odaInstanceId",
        "resourceId",
        "requestAction",
        "status",
        "resources"
    })
    public WorkRequestSummary(
            String id,
            String compartmentId,
            String odaInstanceId,
            String resourceId,
            RequestAction requestAction,
            Status status,
            java.util.List<WorkRequestResource> resources) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.odaInstanceId = odaInstanceId;
        this.resourceId = resourceId;
        this.requestAction = requestAction;
        this.status = status;
        this.resources = resources;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The identifier of the work request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The identifier of the work request.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The identifier of the compartment that contains the work request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The identifier of the compartment that contains the work request.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The identifier of the Digital Assistant instance to which this work request pertains.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("odaInstanceId")
        private String odaInstanceId;

        /**
         * The identifier of the Digital Assistant instance to which this work request pertains.
         * @param odaInstanceId the value to set
         * @return this builder
         **/
        public Builder odaInstanceId(String odaInstanceId) {
            this.odaInstanceId = odaInstanceId;
            this.__explicitlySet__.add("odaInstanceId");
            return this;
        }
        /**
         * The identifier of the resource to which this work request pertains.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * The identifier of the resource to which this work request pertains.
         * @param resourceId the value to set
         * @return this builder
         **/
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }
        /**
         * The type of the operation that's associated with the work request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("requestAction")
        private RequestAction requestAction;

        /**
         * The type of the operation that's associated with the work request.
         * @param requestAction the value to set
         * @return this builder
         **/
        public Builder requestAction(RequestAction requestAction) {
            this.requestAction = requestAction;
            this.__explicitlySet__.add("requestAction");
            return this;
        }
        /**
         * The status of current work request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * The status of current work request.
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * The resources that this work request affects.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resources")
        private java.util.List<WorkRequestResource> resources;

        /**
         * The resources that this work request affects.
         * @param resources the value to set
         * @return this builder
         **/
        public Builder resources(java.util.List<WorkRequestResource> resources) {
            this.resources = resources;
            this.__explicitlySet__.add("resources");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WorkRequestSummary build() {
            WorkRequestSummary model =
                    new WorkRequestSummary(
                            this.id,
                            this.compartmentId,
                            this.odaInstanceId,
                            this.resourceId,
                            this.requestAction,
                            this.status,
                            this.resources);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WorkRequestSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("odaInstanceId")) {
                this.odaInstanceId(model.getOdaInstanceId());
            }
            if (model.wasPropertyExplicitlySet("resourceId")) {
                this.resourceId(model.getResourceId());
            }
            if (model.wasPropertyExplicitlySet("requestAction")) {
                this.requestAction(model.getRequestAction());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("resources")) {
                this.resources(model.getResources());
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
     * The identifier of the work request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The identifier of the work request.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The identifier of the compartment that contains the work request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The identifier of the compartment that contains the work request.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The identifier of the Digital Assistant instance to which this work request pertains.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("odaInstanceId")
    private final String odaInstanceId;

    /**
     * The identifier of the Digital Assistant instance to which this work request pertains.
     * @return the value
     **/
    public String getOdaInstanceId() {
        return odaInstanceId;
    }

    /**
     * The identifier of the resource to which this work request pertains.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * The identifier of the resource to which this work request pertains.
     * @return the value
     **/
    public String getResourceId() {
        return resourceId;
    }

    /**
     * The type of the operation that's associated with the work request.
     **/
    public enum RequestAction {
        CreateOdaInstance("CREATE_ODA_INSTANCE"),
        UpgradeOdaInstance("UPGRADE_ODA_INSTANCE"),
        DeleteOdaInstance("DELETE_ODA_INSTANCE"),
        PurgeOdaInstance("PURGE_ODA_INSTANCE"),
        RecoverOdaInstance("RECOVER_ODA_INSTANCE"),
        StopOdaInstance("STOP_ODA_INSTANCE"),
        StartOdaInstance("START_ODA_INSTANCE"),
        ChangeOdaInstanceCompartment("CHANGE_ODA_INSTANCE_COMPARTMENT"),
        ChangeCustEncKey("CHANGE_CUST_ENC_KEY"),
        DeactCustEncKey("DEACT_CUST_ENC_KEY"),
        CreateAssociation("CREATE_ASSOCIATION"),
        DeleteAssociation("DELETE_ASSOCIATION"),
        UpdateEntitlementsForCacct("UPDATE_ENTITLEMENTS_FOR_CACCT"),
        LookupOdaInstancesForCacct("LOOKUP_ODA_INSTANCES_FOR_CACCT"),
        CreateOdaInstanceAttachment("CREATE_ODA_INSTANCE_ATTACHMENT"),
        UpdateOdaInstanceAttachment("UPDATE_ODA_INSTANCE_ATTACHMENT"),
        DeleteOdaInstanceAttachment("DELETE_ODA_INSTANCE_ATTACHMENT"),
        CreateImportedPackage("CREATE_IMPORTED_PACKAGE"),
        UpdateImportedPackage("UPDATE_IMPORTED_PACKAGE"),
        DeleteImportedPackage("DELETE_IMPORTED_PACKAGE"),
        ImportBot("IMPORT_BOT"),
        CreateSkill("CREATE_SKILL"),
        CloneSkill("CLONE_SKILL"),
        ExtendSkill("EXTEND_SKILL"),
        VersionSkill("VERSION_SKILL"),
        ExportSkill("EXPORT_SKILL"),
        CreateDigitalAssistant("CREATE_DIGITAL_ASSISTANT"),
        CloneDigitalAssistant("CLONE_DIGITAL_ASSISTANT"),
        ExtendDigitalAssistant("EXTEND_DIGITAL_ASSISTANT"),
        VersionDigitalAssistant("VERSION_DIGITAL_ASSISTANT"),
        ExportDigitalAssistant("EXPORT_DIGITAL_ASSISTANT"),
        CreateOdaPrivateEndpoint("CREATE_ODA_PRIVATE_ENDPOINT"),
        DeleteOdaPrivateEndpoint("DELETE_ODA_PRIVATE_ENDPOINT"),
        UpdateOdaPrivateEndpoint("UPDATE_ODA_PRIVATE_ENDPOINT"),
        ChangeOdaPrivateEndpointCompartment("CHANGE_ODA_PRIVATE_ENDPOINT_COMPARTMENT"),
        CreateOdaPrivateEndpointScanProxy("CREATE_ODA_PRIVATE_ENDPOINT_SCAN_PROXY"),
        DeleteOdaPrivateEndpointScanProxy("DELETE_ODA_PRIVATE_ENDPOINT_SCAN_PROXY"),
        CreateOdaPrivateEndpointAttachment("CREATE_ODA_PRIVATE_ENDPOINT_ATTACHMENT"),
        DeleteOdaPrivateEndpointAttachment("DELETE_ODA_PRIVATE_ENDPOINT_ATTACHMENT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(RequestAction.class);

        private final String value;
        private static java.util.Map<String, RequestAction> map;

        static {
            map = new java.util.HashMap<>();
            for (RequestAction v : RequestAction.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RequestAction(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RequestAction create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'RequestAction', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of the operation that's associated with the work request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requestAction")
    private final RequestAction requestAction;

    /**
     * The type of the operation that's associated with the work request.
     * @return the value
     **/
    public RequestAction getRequestAction() {
        return requestAction;
    }

    /**
     * The status of current work request.
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
     * The status of current work request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * The status of current work request.
     * @return the value
     **/
    public Status getStatus() {
        return status;
    }

    /**
     * The resources that this work request affects.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    private final java.util.List<WorkRequestResource> resources;

    /**
     * The resources that this work request affects.
     * @return the value
     **/
    public java.util.List<WorkRequestResource> getResources() {
        return resources;
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
        sb.append("WorkRequestSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", odaInstanceId=").append(String.valueOf(this.odaInstanceId));
        sb.append(", resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", requestAction=").append(String.valueOf(this.requestAction));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", resources=").append(String.valueOf(this.resources));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WorkRequestSummary)) {
            return false;
        }

        WorkRequestSummary other = (WorkRequestSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.odaInstanceId, other.odaInstanceId)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.requestAction, other.requestAction)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.resources, other.resources)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.odaInstanceId == null ? 43 : this.odaInstanceId.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.requestAction == null ? 43 : this.requestAction.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.resources == null ? 43 : this.resources.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

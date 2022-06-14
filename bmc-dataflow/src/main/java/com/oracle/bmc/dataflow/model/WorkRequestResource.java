/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataflow.model;

/**
 * A resource related to a Data Flow work request.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200129")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = WorkRequestResource.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class WorkRequestResource {
    @Deprecated
    @java.beans.ConstructorProperties({
        "actionType",
        "id",
        "resourceId",
        "resourceType",
        "resourceUri",
        "workRequestid"
    })
    public WorkRequestResource(
            ActionType actionType,
            Long id,
            String resourceId,
            String resourceType,
            String resourceUri,
            String workRequestid) {
        super();
        this.actionType = actionType;
        this.id = id;
        this.resourceId = resourceId;
        this.resourceType = resourceType;
        this.resourceUri = resourceUri;
        this.workRequestid = workRequestid;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The way in which this resource is affected by the work tracked in the work request.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("actionType")
        private ActionType actionType;

        /**
         * The way in which this resource is affected by the work tracked in the work request.
         *
         * @param actionType the value to set
         * @return this builder
         **/
        public Builder actionType(ActionType actionType) {
            this.actionType = actionType;
            this.__explicitlySet__.add("actionType");
            return this;
        }
        /**
         * The id of a work request resource object.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private Long id;

        /**
         * The id of a work request resource object.
         *
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(Long id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The id of the releated resource. See resourceType to identity the specific type of resource.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * The id of the releated resource. See resourceType to identity the specific type of resource.
         *
         * @param resourceId the value to set
         * @return this builder
         **/
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }
        /**
         * The type of resource.  See resourceId for the id of the specific resource.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private String resourceType;

        /**
         * The type of resource.  See resourceId for the id of the specific resource.
         *
         * @param resourceType the value to set
         * @return this builder
         **/
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /**
         * The URI path that the user can use to get access to the resource metadata
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceUri")
        private String resourceUri;

        /**
         * The URI path that the user can use to get access to the resource metadata
         *
         * @param resourceUri the value to set
         * @return this builder
         **/
        public Builder resourceUri(String resourceUri) {
            this.resourceUri = resourceUri;
            this.__explicitlySet__.add("resourceUri");
            return this;
        }
        /**
         * The OCID of a work request.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("workRequestid")
        private String workRequestid;

        /**
         * The OCID of a work request.
         *
         * @param workRequestid the value to set
         * @return this builder
         **/
        public Builder workRequestid(String workRequestid) {
            this.workRequestid = workRequestid;
            this.__explicitlySet__.add("workRequestid");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WorkRequestResource build() {
            WorkRequestResource __instance__ =
                    new WorkRequestResource(
                            actionType, id, resourceId, resourceType, resourceUri, workRequestid);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WorkRequestResource o) {
            Builder copiedBuilder =
                    actionType(o.getActionType())
                            .id(o.getId())
                            .resourceId(o.getResourceId())
                            .resourceType(o.getResourceType())
                            .resourceUri(o.getResourceUri())
                            .workRequestid(o.getWorkRequestid());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * The way in which this resource is affected by the work tracked in the work request.
     *
     **/
    public enum ActionType {
        Created("CREATED"),
        Updated("UPDATED"),
        Deleted("DELETED"),
        Inprogress("INPROGRESS"),
        Related("RELATED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ActionType.class);

        private final String value;
        private static java.util.Map<String, ActionType> map;

        static {
            map = new java.util.HashMap<>();
            for (ActionType v : ActionType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ActionType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ActionType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ActionType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The way in which this resource is affected by the work tracked in the work request.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("actionType")
    private final ActionType actionType;

    /**
     * The way in which this resource is affected by the work tracked in the work request.
     *
     * @return the value
     **/
    public ActionType getActionType() {
        return actionType;
    }

    /**
     * The id of a work request resource object.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final Long id;

    /**
     * The id of a work request resource object.
     *
     * @return the value
     **/
    public Long getId() {
        return id;
    }

    /**
     * The id of the releated resource. See resourceType to identity the specific type of resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * The id of the releated resource. See resourceType to identity the specific type of resource.
     *
     * @return the value
     **/
    public String getResourceId() {
        return resourceId;
    }

    /**
     * The type of resource.  See resourceId for the id of the specific resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final String resourceType;

    /**
     * The type of resource.  See resourceId for the id of the specific resource.
     *
     * @return the value
     **/
    public String getResourceType() {
        return resourceType;
    }

    /**
     * The URI path that the user can use to get access to the resource metadata
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceUri")
    private final String resourceUri;

    /**
     * The URI path that the user can use to get access to the resource metadata
     *
     * @return the value
     **/
    public String getResourceUri() {
        return resourceUri;
    }

    /**
     * The OCID of a work request.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("workRequestid")
    private final String workRequestid;

    /**
     * The OCID of a work request.
     *
     * @return the value
     **/
    public String getWorkRequestid() {
        return workRequestid;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("WorkRequestResource(");
        sb.append("actionType=").append(String.valueOf(this.actionType));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", resourceUri=").append(String.valueOf(this.resourceUri));
        sb.append(", workRequestid=").append(String.valueOf(this.workRequestid));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
        return java.util.Objects.equals(this.actionType, other.actionType)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.resourceUri, other.resourceUri)
                && java.util.Objects.equals(this.workRequestid, other.workRequestid)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.actionType == null ? 43 : this.actionType.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result = (result * PRIME) + (this.resourceUri == null ? 43 : this.resourceUri.hashCode());
        result =
                (result * PRIME)
                        + (this.workRequestid == null ? 43 : this.workRequestid.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}

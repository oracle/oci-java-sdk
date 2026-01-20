/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dif.model;

/**
 * Details to create a Stack. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250830")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateStackDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateStackDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "compartmentId",
        "notificationEmail",
        "stackTemplates",
        "services",
        "adb",
        "ggcs",
        "dataflow",
        "objectstorage",
        "genai",
        "freeformTags",
        "definedTags"
    })
    public CreateStackDetails(
            String displayName,
            String compartmentId,
            String notificationEmail,
            java.util.List<StackTemplate> stackTemplates,
            java.util.List<Service> services,
            java.util.List<AdbDetail> adb,
            java.util.List<GgcsDetail> ggcs,
            java.util.List<DataflowDetail> dataflow,
            java.util.List<ObjectStorageDetail> objectstorage,
            java.util.List<GenAiDetail> genai,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.notificationEmail = notificationEmail;
        this.stackTemplates = stackTemplates;
        this.services = services;
        this.adb = adb;
        this.ggcs = ggcs;
        this.dataflow = dataflow;
        this.objectstorage = objectstorage;
        this.genai = genai;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A user-friendly name. Should be unique per compartment. Avoid entering confidential
         * information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Should be unique per compartment. Avoid entering confidential
         * information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment to create the Stack in.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment to create the Stack in.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** email id to which the stack notifications would be sent. */
        @com.fasterxml.jackson.annotation.JsonProperty("notificationEmail")
        private String notificationEmail;

        /**
         * email id to which the stack notifications would be sent.
         *
         * @param notificationEmail the value to set
         * @return this builder
         */
        public Builder notificationEmail(String notificationEmail) {
            this.notificationEmail = notificationEmail;
            this.__explicitlySet__.add("notificationEmail");
            return this;
        }
        /** List of templates to be onboarded for the stack. */
        @com.fasterxml.jackson.annotation.JsonProperty("stackTemplates")
        private java.util.List<StackTemplate> stackTemplates;

        /**
         * List of templates to be onboarded for the stack.
         *
         * @param stackTemplates the value to set
         * @return this builder
         */
        public Builder stackTemplates(java.util.List<StackTemplate> stackTemplates) {
            this.stackTemplates = stackTemplates;
            this.__explicitlySet__.add("stackTemplates");
            return this;
        }
        /** List of services to be onboarded for the stack. */
        @com.fasterxml.jackson.annotation.JsonProperty("services")
        private java.util.List<Service> services;

        /**
         * List of services to be onboarded for the stack.
         *
         * @param services the value to set
         * @return this builder
         */
        public Builder services(java.util.List<Service> services) {
            this.services = services;
            this.__explicitlySet__.add("services");
            return this;
        }
        /** ADB details if adb is included in the services. */
        @com.fasterxml.jackson.annotation.JsonProperty("adb")
        private java.util.List<AdbDetail> adb;

        /**
         * ADB details if adb is included in the services.
         *
         * @param adb the value to set
         * @return this builder
         */
        public Builder adb(java.util.List<AdbDetail> adb) {
            this.adb = adb;
            this.__explicitlySet__.add("adb");
            return this;
        }
        /** GGCS details if ggcs is included in the services. */
        @com.fasterxml.jackson.annotation.JsonProperty("ggcs")
        private java.util.List<GgcsDetail> ggcs;

        /**
         * GGCS details if ggcs is included in the services.
         *
         * @param ggcs the value to set
         * @return this builder
         */
        public Builder ggcs(java.util.List<GgcsDetail> ggcs) {
            this.ggcs = ggcs;
            this.__explicitlySet__.add("ggcs");
            return this;
        }
        /** DATAFLOW details if dataflow is included in the services. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataflow")
        private java.util.List<DataflowDetail> dataflow;

        /**
         * DATAFLOW details if dataflow is included in the services.
         *
         * @param dataflow the value to set
         * @return this builder
         */
        public Builder dataflow(java.util.List<DataflowDetail> dataflow) {
            this.dataflow = dataflow;
            this.__explicitlySet__.add("dataflow");
            return this;
        }
        /** Object Storage Details if object storage is included in services. */
        @com.fasterxml.jackson.annotation.JsonProperty("objectstorage")
        private java.util.List<ObjectStorageDetail> objectstorage;

        /**
         * Object Storage Details if object storage is included in services.
         *
         * @param objectstorage the value to set
         * @return this builder
         */
        public Builder objectstorage(java.util.List<ObjectStorageDetail> objectstorage) {
            this.objectstorage = objectstorage;
            this.__explicitlySet__.add("objectstorage");
            return this;
        }
        /** GenAi Details if genai is included in services. */
        @com.fasterxml.jackson.annotation.JsonProperty("genai")
        private java.util.List<GenAiDetail> genai;

        /**
         * GenAi Details if genai is included in services.
         *
         * @param genai the value to set
         * @return this builder
         */
        public Builder genai(java.util.List<GenAiDetail> genai) {
            this.genai = genai;
            this.__explicitlySet__.add("genai");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateStackDetails build() {
            CreateStackDetails model =
                    new CreateStackDetails(
                            this.displayName,
                            this.compartmentId,
                            this.notificationEmail,
                            this.stackTemplates,
                            this.services,
                            this.adb,
                            this.ggcs,
                            this.dataflow,
                            this.objectstorage,
                            this.genai,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateStackDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("notificationEmail")) {
                this.notificationEmail(model.getNotificationEmail());
            }
            if (model.wasPropertyExplicitlySet("stackTemplates")) {
                this.stackTemplates(model.getStackTemplates());
            }
            if (model.wasPropertyExplicitlySet("services")) {
                this.services(model.getServices());
            }
            if (model.wasPropertyExplicitlySet("adb")) {
                this.adb(model.getAdb());
            }
            if (model.wasPropertyExplicitlySet("ggcs")) {
                this.ggcs(model.getGgcs());
            }
            if (model.wasPropertyExplicitlySet("dataflow")) {
                this.dataflow(model.getDataflow());
            }
            if (model.wasPropertyExplicitlySet("objectstorage")) {
                this.objectstorage(model.getObjectstorage());
            }
            if (model.wasPropertyExplicitlySet("genai")) {
                this.genai(model.getGenai());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * A user-friendly name. Should be unique per compartment. Avoid entering confidential
     * information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Should be unique per compartment. Avoid entering confidential
     * information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment to create the Stack in.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment to create the Stack in.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** email id to which the stack notifications would be sent. */
    @com.fasterxml.jackson.annotation.JsonProperty("notificationEmail")
    private final String notificationEmail;

    /**
     * email id to which the stack notifications would be sent.
     *
     * @return the value
     */
    public String getNotificationEmail() {
        return notificationEmail;
    }

    /** List of templates to be onboarded for the stack. */
    @com.fasterxml.jackson.annotation.JsonProperty("stackTemplates")
    private final java.util.List<StackTemplate> stackTemplates;

    /**
     * List of templates to be onboarded for the stack.
     *
     * @return the value
     */
    public java.util.List<StackTemplate> getStackTemplates() {
        return stackTemplates;
    }

    /** List of services to be onboarded for the stack. */
    @com.fasterxml.jackson.annotation.JsonProperty("services")
    private final java.util.List<Service> services;

    /**
     * List of services to be onboarded for the stack.
     *
     * @return the value
     */
    public java.util.List<Service> getServices() {
        return services;
    }

    /** ADB details if adb is included in the services. */
    @com.fasterxml.jackson.annotation.JsonProperty("adb")
    private final java.util.List<AdbDetail> adb;

    /**
     * ADB details if adb is included in the services.
     *
     * @return the value
     */
    public java.util.List<AdbDetail> getAdb() {
        return adb;
    }

    /** GGCS details if ggcs is included in the services. */
    @com.fasterxml.jackson.annotation.JsonProperty("ggcs")
    private final java.util.List<GgcsDetail> ggcs;

    /**
     * GGCS details if ggcs is included in the services.
     *
     * @return the value
     */
    public java.util.List<GgcsDetail> getGgcs() {
        return ggcs;
    }

    /** DATAFLOW details if dataflow is included in the services. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataflow")
    private final java.util.List<DataflowDetail> dataflow;

    /**
     * DATAFLOW details if dataflow is included in the services.
     *
     * @return the value
     */
    public java.util.List<DataflowDetail> getDataflow() {
        return dataflow;
    }

    /** Object Storage Details if object storage is included in services. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectstorage")
    private final java.util.List<ObjectStorageDetail> objectstorage;

    /**
     * Object Storage Details if object storage is included in services.
     *
     * @return the value
     */
    public java.util.List<ObjectStorageDetail> getObjectstorage() {
        return objectstorage;
    }

    /** GenAi Details if genai is included in services. */
    @com.fasterxml.jackson.annotation.JsonProperty("genai")
    private final java.util.List<GenAiDetail> genai;

    /**
     * GenAi Details if genai is included in services.
     *
     * @return the value
     */
    public java.util.List<GenAiDetail> getGenai() {
        return genai;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("CreateStackDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", notificationEmail=").append(String.valueOf(this.notificationEmail));
        sb.append(", stackTemplates=").append(String.valueOf(this.stackTemplates));
        sb.append(", services=").append(String.valueOf(this.services));
        sb.append(", adb=").append(String.valueOf(this.adb));
        sb.append(", ggcs=").append(String.valueOf(this.ggcs));
        sb.append(", dataflow=").append(String.valueOf(this.dataflow));
        sb.append(", objectstorage=").append(String.valueOf(this.objectstorage));
        sb.append(", genai=").append(String.valueOf(this.genai));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateStackDetails)) {
            return false;
        }

        CreateStackDetails other = (CreateStackDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.notificationEmail, other.notificationEmail)
                && java.util.Objects.equals(this.stackTemplates, other.stackTemplates)
                && java.util.Objects.equals(this.services, other.services)
                && java.util.Objects.equals(this.adb, other.adb)
                && java.util.Objects.equals(this.ggcs, other.ggcs)
                && java.util.Objects.equals(this.dataflow, other.dataflow)
                && java.util.Objects.equals(this.objectstorage, other.objectstorage)
                && java.util.Objects.equals(this.genai, other.genai)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.notificationEmail == null ? 43 : this.notificationEmail.hashCode());
        result =
                (result * PRIME)
                        + (this.stackTemplates == null ? 43 : this.stackTemplates.hashCode());
        result = (result * PRIME) + (this.services == null ? 43 : this.services.hashCode());
        result = (result * PRIME) + (this.adb == null ? 43 : this.adb.hashCode());
        result = (result * PRIME) + (this.ggcs == null ? 43 : this.ggcs.hashCode());
        result = (result * PRIME) + (this.dataflow == null ? 43 : this.dataflow.hashCode());
        result =
                (result * PRIME)
                        + (this.objectstorage == null ? 43 : this.objectstorage.hashCode());
        result = (result * PRIME) + (this.genai == null ? 43 : this.genai.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

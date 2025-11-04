/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dif.model;

/**
 * The configuration details for adding new services to the existing Stack. <br>
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
        builder = AddServiceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AddServiceDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "stackTemplates",
        "services",
        "adb",
        "ggcs",
        "dataflow",
        "objectstorage",
        "genai"
    })
    public AddServiceDetails(
            java.util.List<StackTemplate> stackTemplates,
            java.util.List<Service> services,
            java.util.List<AdbDetail> adb,
            java.util.List<GgcsDetail> ggcs,
            java.util.List<DataflowDetail> dataflow,
            java.util.List<ObjectStorageDetail> objectstorage,
            java.util.List<GenAiDetail> genai) {
        super();
        this.stackTemplates = stackTemplates;
        this.services = services;
        this.adb = adb;
        this.ggcs = ggcs;
        this.dataflow = dataflow;
        this.objectstorage = objectstorage;
        this.genai = genai;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** List of templates to be added for the stack. */
        @com.fasterxml.jackson.annotation.JsonProperty("stackTemplates")
        private java.util.List<StackTemplate> stackTemplates;

        /**
         * List of templates to be added for the stack.
         *
         * @param stackTemplates the value to set
         * @return this builder
         */
        public Builder stackTemplates(java.util.List<StackTemplate> stackTemplates) {
            this.stackTemplates = stackTemplates;
            this.__explicitlySet__.add("stackTemplates");
            return this;
        }
        /** List of services to be added for the stack. */
        @com.fasterxml.jackson.annotation.JsonProperty("services")
        private java.util.List<Service> services;

        /**
         * List of services to be added for the stack.
         *
         * @param services the value to set
         * @return this builder
         */
        public Builder services(java.util.List<Service> services) {
            this.services = services;
            this.__explicitlySet__.add("services");
            return this;
        }
        /** ADB details if adb is included in the services to be added. */
        @com.fasterxml.jackson.annotation.JsonProperty("adb")
        private java.util.List<AdbDetail> adb;

        /**
         * ADB details if adb is included in the services to be added.
         *
         * @param adb the value to set
         * @return this builder
         */
        public Builder adb(java.util.List<AdbDetail> adb) {
            this.adb = adb;
            this.__explicitlySet__.add("adb");
            return this;
        }
        /** GGCS details if ggcs is included in the services to be added. */
        @com.fasterxml.jackson.annotation.JsonProperty("ggcs")
        private java.util.List<GgcsDetail> ggcs;

        /**
         * GGCS details if ggcs is included in the services to be added.
         *
         * @param ggcs the value to set
         * @return this builder
         */
        public Builder ggcs(java.util.List<GgcsDetail> ggcs) {
            this.ggcs = ggcs;
            this.__explicitlySet__.add("ggcs");
            return this;
        }
        /** DATAFLOW details if dataflow is included in the services to be added. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataflow")
        private java.util.List<DataflowDetail> dataflow;

        /**
         * DATAFLOW details if dataflow is included in the services to be added.
         *
         * @param dataflow the value to set
         * @return this builder
         */
        public Builder dataflow(java.util.List<DataflowDetail> dataflow) {
            this.dataflow = dataflow;
            this.__explicitlySet__.add("dataflow");
            return this;
        }
        /** Object Storage Details if object storage is included in services to be added. */
        @com.fasterxml.jackson.annotation.JsonProperty("objectstorage")
        private java.util.List<ObjectStorageDetail> objectstorage;

        /**
         * Object Storage Details if object storage is included in services to be added.
         *
         * @param objectstorage the value to set
         * @return this builder
         */
        public Builder objectstorage(java.util.List<ObjectStorageDetail> objectstorage) {
            this.objectstorage = objectstorage;
            this.__explicitlySet__.add("objectstorage");
            return this;
        }
        /** GenAI Details if genai is included in services to be added. */
        @com.fasterxml.jackson.annotation.JsonProperty("genai")
        private java.util.List<GenAiDetail> genai;

        /**
         * GenAI Details if genai is included in services to be added.
         *
         * @param genai the value to set
         * @return this builder
         */
        public Builder genai(java.util.List<GenAiDetail> genai) {
            this.genai = genai;
            this.__explicitlySet__.add("genai");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AddServiceDetails build() {
            AddServiceDetails model =
                    new AddServiceDetails(
                            this.stackTemplates,
                            this.services,
                            this.adb,
                            this.ggcs,
                            this.dataflow,
                            this.objectstorage,
                            this.genai);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AddServiceDetails model) {
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

    /** List of templates to be added for the stack. */
    @com.fasterxml.jackson.annotation.JsonProperty("stackTemplates")
    private final java.util.List<StackTemplate> stackTemplates;

    /**
     * List of templates to be added for the stack.
     *
     * @return the value
     */
    public java.util.List<StackTemplate> getStackTemplates() {
        return stackTemplates;
    }

    /** List of services to be added for the stack. */
    @com.fasterxml.jackson.annotation.JsonProperty("services")
    private final java.util.List<Service> services;

    /**
     * List of services to be added for the stack.
     *
     * @return the value
     */
    public java.util.List<Service> getServices() {
        return services;
    }

    /** ADB details if adb is included in the services to be added. */
    @com.fasterxml.jackson.annotation.JsonProperty("adb")
    private final java.util.List<AdbDetail> adb;

    /**
     * ADB details if adb is included in the services to be added.
     *
     * @return the value
     */
    public java.util.List<AdbDetail> getAdb() {
        return adb;
    }

    /** GGCS details if ggcs is included in the services to be added. */
    @com.fasterxml.jackson.annotation.JsonProperty("ggcs")
    private final java.util.List<GgcsDetail> ggcs;

    /**
     * GGCS details if ggcs is included in the services to be added.
     *
     * @return the value
     */
    public java.util.List<GgcsDetail> getGgcs() {
        return ggcs;
    }

    /** DATAFLOW details if dataflow is included in the services to be added. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataflow")
    private final java.util.List<DataflowDetail> dataflow;

    /**
     * DATAFLOW details if dataflow is included in the services to be added.
     *
     * @return the value
     */
    public java.util.List<DataflowDetail> getDataflow() {
        return dataflow;
    }

    /** Object Storage Details if object storage is included in services to be added. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectstorage")
    private final java.util.List<ObjectStorageDetail> objectstorage;

    /**
     * Object Storage Details if object storage is included in services to be added.
     *
     * @return the value
     */
    public java.util.List<ObjectStorageDetail> getObjectstorage() {
        return objectstorage;
    }

    /** GenAI Details if genai is included in services to be added. */
    @com.fasterxml.jackson.annotation.JsonProperty("genai")
    private final java.util.List<GenAiDetail> genai;

    /**
     * GenAI Details if genai is included in services to be added.
     *
     * @return the value
     */
    public java.util.List<GenAiDetail> getGenai() {
        return genai;
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
        sb.append("AddServiceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("stackTemplates=").append(String.valueOf(this.stackTemplates));
        sb.append(", services=").append(String.valueOf(this.services));
        sb.append(", adb=").append(String.valueOf(this.adb));
        sb.append(", ggcs=").append(String.valueOf(this.ggcs));
        sb.append(", dataflow=").append(String.valueOf(this.dataflow));
        sb.append(", objectstorage=").append(String.valueOf(this.objectstorage));
        sb.append(", genai=").append(String.valueOf(this.genai));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AddServiceDetails)) {
            return false;
        }

        AddServiceDetails other = (AddServiceDetails) o;
        return java.util.Objects.equals(this.stackTemplates, other.stackTemplates)
                && java.util.Objects.equals(this.services, other.services)
                && java.util.Objects.equals(this.adb, other.adb)
                && java.util.Objects.equals(this.ggcs, other.ggcs)
                && java.util.Objects.equals(this.dataflow, other.dataflow)
                && java.util.Objects.equals(this.objectstorage, other.objectstorage)
                && java.util.Objects.equals(this.genai, other.genai)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Creation details for an instance configuration.
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
@lombok.AllArgsConstructor(
    onConstructor = @__({@Deprecated}),
    access = lombok.AccessLevel.PROTECTED
)
@lombok.Value
@lombok.experimental.NonFinal
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "source",
    defaultImpl = CreateInstanceConfigurationBase.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateInstanceConfigurationDetails.class,
        name = "NONE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateInstanceConfigurationFromInstanceDetails.class,
        name = "INSTANCE"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreateInstanceConfigurationBase {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment
     * containing the instance configuration.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Operations\": {\"CostCenter\": \"42\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * A user-friendly name for the instance configuration.  Does not have to be unique,
     * and it's changeable. Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Department\": \"Finance\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * The source of the instance configuration. An instance configuration defines the
     * settings to use when creating Compute instances, including details
     * such as the base image, shape, and metadata. You can also specify the associated resources for the
     * instance, such as block volume attachments and network configuration.
     * <p>
     * When you create an instance configuration using an existing instance as a template, the instance
     * configuration does not include any information from the source instance's boot volume, such as installed
     * applications, binaries, and files on the instance. It also does not include the contents of
     * any block volumes that are attached to the instance.
     * <p>
     * To create an instance configuration that includes the custom setup from an instance's boot volume, you
     * must first create a custom image from the instance (see {@link #createImage(CreateImageRequest) createImage}).
     * Then, use the custom image to launch a new instance
     * (see {@link #launchInstance(LaunchInstanceRequest) launchInstance}). Finally, create the instance
     * configuration based on the instance that you created from the custom image.
     * <p>
     * To include block volume contents with an instance configuration, first create a backup of the attached block volumes
     * (see {@link #createVolumeBackup(CreateVolumeBackupRequest) createVolumeBackup}). Then, create the instance
     * configuration by specifying the list of settings, using
     * {@link #instanceConfigurationVolumeSourceFromVolumeBackupDetails(InstanceConfigurationVolumeSourceFromVolumeBackupDetailsRequest) instanceConfigurationVolumeSourceFromVolumeBackupDetails}
     * to include the block volume backups in the list of settings.
     * <p>
     * The following values are supported:
     * <p>
     * `NONE`: Creates an instance configuration using the list of settings that you specify.
     * <p>
     * `INSTANCE`: Creates an instance configuration using an existing instance as a template.
     *
     **/
    public enum Source {
        None("NONE"),
        Instance("INSTANCE"),
        ;

        private final String value;
        private static java.util.Map<String, Source> map;

        static {
            map = new java.util.HashMap<>();
            for (Source v : Source.values()) {
                map.put(v.getValue(), v);
            }
        }

        Source(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Source create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Source: " + key);
        }
    };
}

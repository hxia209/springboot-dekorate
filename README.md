# Getting Started

This is a simple "Hello World" application exposed as rest service using Spring-boot framework. The goal here is to generate necessary yaml files and deploy the application to an Openshift cluster.

In order to use dekorate in your Spring-boot application, just add the following dependency to your project pom.xml.
```
<dependency>
    <groupId>io.dekorate</groupId>
    <artifactId>openshift-spring-starter</artifactId>
    <version>0.10.10</version>
</dependency>
```


To build the application:

`mvn clean package -Ddekorate.build=true`

To deploy the application (requires an running Openshift instance):

`mvn clean package -Ddekorate.deploy=true`

You can add extra configurations via [application.properties](./src/main/resources/application.properties) or annotating it directly into the application.
All available configurations can be found [here](http://dekorate.io/dekorate/assets/config.html).

### Reference Documentation
For further reference, please consider the following sections:

* [Dekorate Getting Started Page](https://dekorate.io/getting-started)

| **Property**                                       | **Type**                      | **Description** | **Default Value** |
|---|:---|:---|---|
| dekorate.openshift.group                           | String                        |             |               |
| dekorate.openshift.name                            | String                        |             |               |
| dekorate.openshift.version                         | String                        |             |               |
| dekorate.openshift.init-containers                 | Container[]                   |             |               |
| dekorate.openshift.labels                          | Label[]                       |             |               |
| dekorate.openshift.annotations                     | Annotation[]                  |             |               |
| dekorate.openshift.env-vars                        | Env[]                         |             |               |
| dekorate.openshift.working-dir                     | String                        |             |               |
| dekorate.openshift.command                         | String[]                      |             |               |
| dekorate.openshift.arguments                       | String[]                      |             |               |
| dekorate.openshift.replicas                        | int                           |             | 1             |
| dekorate.openshift.service-account                 | String                        |             |               |
| dekorate.openshift.host                            | String                        |             |               |
| dekorate.openshift.ports                           | Port[]                        |             |               |
| dekorate.openshift.service-type                    | ServiceType                   |             | ClusterIP     |
| dekorate.openshift.pvc-volumes                     | PersistentVolumeClaimVolume[] |             |               |
| dekorate.openshift.secret-volumes                  | SecretVolume[]                |             |               |
| dekorate.openshift.config-map-volumes              | ConfigMapVolume[]             |             |               |
| dekorate.openshift.git-repo-volumes                | GitRepoVolume[]               |             |               |
| dekorate.openshift.aws-elastic-block-store-volumes | AwsElasticBlockStoreVolume[]  |             |               |
| dekorate.openshift.azure-disk-volumes              | AzureDiskVolume[]             |             |               |
| dekorate.openshift.azure-file-volumes              | AzureFileVolume[]             |             |               |
| dekorate.openshift.mounts                          | Mount[]                       |             |               |
| dekorate.openshift.image-pull-policy               | ImagePullPolicy               |             | IfNotPresent  |
| dekorate.openshift.image-pull-secrets              | String[]                      |             |               |
| dekorate.openshift.liveness-probe                  | Probe                         |             | ( see Probe ) |
| dekorate.openshift.readiness-probe                 | Probe                         |             | ( see Probe ) |
| dekorate.openshift.sidecars                        | Container[]                   |             |               |
| dekorate.openshift.expose                          | boolean                       |             | false         |
| dekorate.openshift.auto-deploy-enabled             | boolean                       |             | false         |
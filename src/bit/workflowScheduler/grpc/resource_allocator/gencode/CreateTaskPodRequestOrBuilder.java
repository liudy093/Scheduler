// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resource_allocator.proto

package bit.workflowScheduler.grpc.resource_allocator.gencode;

public interface CreateTaskPodRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bit.workflowScheduler.grpc.resource_allocator.gencode.CreateTaskPodRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *workflow的ID
   * </pre>
   *
   * <code>string workflowId = 1;</code>
   */
  java.lang.String getWorkflowId();
  /**
   * <pre>
   *workflow的ID
   * </pre>
   *
   * <code>string workflowId = 1;</code>
   */
  com.google.protobuf.ByteString
      getWorkflowIdBytes();

  /**
   * <pre>
   *taskName
   * </pre>
   *
   * <code>string taskName = 2;</code>
   */
  java.lang.String getTaskName();
  /**
   * <pre>
   *taskName
   * </pre>
   *
   * <code>string taskName = 2;</code>
   */
  com.google.protobuf.ByteString
      getTaskNameBytes();

  /**
   * <pre>
   *任务镜像
   * </pre>
   *
   * <code>string image = 3;</code>
   */
  java.lang.String getImage();
  /**
   * <pre>
   *任务镜像
   * </pre>
   *
   * <code>string image = 3;</code>
   */
  com.google.protobuf.ByteString
      getImageBytes();

  /**
   * <pre>
   *基本单位 millicore(1Core=1000millicore)
   * </pre>
   *
   * <code>int64 cpu = 4;</code>
   */
  long getCpu();

  /**
   * <pre>
   *基本单位 MiB
   * </pre>
   *
   * <code>int64 mem = 5;</code>
   */
  long getMem();

  /**
   * <pre>
   *需要输入给 POD 的环境变量
   * </pre>
   *
   * <code>map&lt;string, string&gt; env = 6;</code>
   */
  int getEnvCount();
  /**
   * <pre>
   *需要输入给 POD 的环境变量
   * </pre>
   *
   * <code>map&lt;string, string&gt; env = 6;</code>
   */
  boolean containsEnv(
      java.lang.String key);
  /**
   * Use {@link #getEnvMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getEnv();
  /**
   * <pre>
   *需要输入给 POD 的环境变量
   * </pre>
   *
   * <code>map&lt;string, string&gt; env = 6;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getEnvMap();
  /**
   * <pre>
   *需要输入给 POD 的环境变量
   * </pre>
   *
   * <code>map&lt;string, string&gt; env = 6;</code>
   */

  java.lang.String getEnvOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   *需要输入给 POD 的环境变量
   * </pre>
   *
   * <code>map&lt;string, string&gt; env = 6;</code>
   */

  java.lang.String getEnvOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * 输入向量
   * </pre>
   *
   * <code>repeated string input_vector = 7;</code>
   */
  java.util.List<java.lang.String>
      getInputVectorList();
  /**
   * <pre>
   * 输入向量
   * </pre>
   *
   * <code>repeated string input_vector = 7;</code>
   */
  int getInputVectorCount();
  /**
   * <pre>
   * 输入向量
   * </pre>
   *
   * <code>repeated string input_vector = 7;</code>
   */
  java.lang.String getInputVector(int index);
  /**
   * <pre>
   * 输入向量
   * </pre>
   *
   * <code>repeated string input_vector = 7;</code>
   */
  com.google.protobuf.ByteString
      getInputVectorBytes(int index);

  /**
   * <pre>
   * 输出向量
   * </pre>
   *
   * <code>repeated string output_vector = 8;</code>
   */
  java.util.List<java.lang.String>
      getOutputVectorList();
  /**
   * <pre>
   * 输出向量
   * </pre>
   *
   * <code>repeated string output_vector = 8;</code>
   */
  int getOutputVectorCount();
  /**
   * <pre>
   * 输出向量
   * </pre>
   *
   * <code>repeated string output_vector = 8;</code>
   */
  java.lang.String getOutputVector(int index);
  /**
   * <pre>
   * 输出向量
   * </pre>
   *
   * <code>repeated string output_vector = 8;</code>
   */
  com.google.protobuf.ByteString
      getOutputVectorBytes(int index);

  /**
   * <pre>
   *time_grade暂时用不到。若customization=true且cost_grade=false，则pod配置资源最大化，即request=limit；若customization=true且cost_grade=true，则pod配置资源最小化；否则，按之前流程走
   * </pre>
   *
   * <code>bool customization = 9;</code>
   */
  boolean getCustomization();

  /**
   * <pre>
   * 是否存在时间等级
   * </pre>
   *
   * <code>bool time_grade = 10;</code>
   */
  boolean getTimeGrade();

  /**
   * <pre>
   * 是否花费（资金）等级
   * </pre>
   *
   * <code>bool cost_grade = 11;</code>
   */
  boolean getCostGrade();
}

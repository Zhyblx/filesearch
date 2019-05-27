## 文件搜索接口文档(API)

###### *本地文件搜索服务


#### 概要：

项目整体划分为三层:搜索服务(lucnen)、文件服务(folder)、应用服务(application)。<br>


#### 一、文件服务接口：

##### 1.扫描文件目录

接口：folder.ScanFile <br>
方法：getScanFilePath() <br>
类型：List<String> <br>
定义：static <br>
描述：扫描文件目录 <br>
参数： <br>
<table>
<tr>
<td>名称</td>
<td>类型</td>
<td>必填</td>
<td>描述</td>

</tr>

<tr>
<td>file</td>
<td>File</td>
<td>是</td>
<td>文件对象</td>

</tr>

</table>

返回结果：文件路径List<br>

##### 2.扫描文件名称

接口：folder.ScanFile <br>
方法：getScanFileName() <br>
类型：List<String> <br>
定义：static <br>
描述：扫描文件名称 <br>
参数： <br>
<table>
<tr>
<td>名称</td>
<td>类型</td>
<td>必填</td>
<td>描述</td>
</tr>

<tr>
<td>file</td>
<td>File</td>
<td>是</td>
<td>文件对象</td>
</tr>

</table>

返回结果：文件名称List<br>



##### 3.扫描文件目录 (废弃)
接口：folder.ScanDirectory <br>
方法：getScanDirectory() <br>
类型：List<String> <br>
定义：static <br>
描述：扫描文件目录 <br>
参数： <br>
<table>
<tr>
<td>名称</td>
<td>类型</td>
<td>必填</td>
<td>描述</td>
</tr>

<tr>
<td>dir</td>
<td>File</td>
<td>是</td>
<td>文件对象</td>
</tr>

<tr>
<td>level</td>
<td>int</td>
<td>是</td>
<td>目录层级</td>
</tr>

</table>

返回结果：文件路径List<br>

##### 4.删除目录
接口：folder.DeleteDirectory <br>
方法：deleteDir() <br>
类型：boolean <br>
定义：static <br>
描述：删除目录及文件 <br>
参数： <br>
<table>
<tr>
<td>名称</td>
<td>类型</td>
<td>必填</td>
<td>描述</td>

</tr>

<tr>
<td>file</td>
<td>File</td>
<td>是</td>
<td>文件对象</td>

</tr>

</table>


#### 二、搜索服务接口：

##### 公共参数：INDEX_DIR_PATH

##### 1.创建索引
接口：lucnen.Createindex <br>
方法：createIndex() <br>
类型：boolean<br>
定义：-- <br>
描述：创建搜索索引文件 <br>
参数： <br>
<table>
<tr>
<td>名称</td>
<td>类型</td>
<td>必填</td>
<td>描述</td>
</tr>

<tr>
<td>indexDir</td>
<td>String</td>
<td>是</td>
<td>索引地址</td>
</tr>

</table>

返回结果：true或false<br>

##### 2.实现搜索
接口：lucnen.SearchBuilder <br>
方法：doSearch()<br>
类型：List<String><br>
定义：static<br>
描述：实现搜索<br>
参数：<br>
<table>
<tr>
<td>名称</td>
<td>类型</td>
<td>必填</td>
<td>描述</td>
</tr>

<tr>
<td>indexDir</td>
<td>String</td>
<td>是</td>
<td>索引地址</td>
</tr>

<tr>
<td>queryStr</td>
<td>String</td>
<td>是</td>
<td>搜索词</td>
</tr>

</table>

返回结果：list搜索结果 <br>

#### 三、数据转化接口：
##### 1.数组转化
接口：converter.DataService <br>
方法：getArray()<br>
类型：String[]<br>
定义：static<br>
描述：list转化数组服务<br>
参数：<br>
<table>
<tr>
<td>名称</td>
<td>类型</td>
<td>必填</td>
<td>描述</td>
</tr>

<tr>
<td>list</td>
<td>List<String> </td>
<td>是</td>
<td>list对象</td>
</tr>

</table>

返回结果：数组地址 <br>




##### 搜索应用：ApplicationService




















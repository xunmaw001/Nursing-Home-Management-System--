<template>
    <div class="addEdit-block">
        <el-form
                class="detail-form-content"
                ref="ruleForm"
                :model="ruleForm"
                :rules="rules"
                label-width="auto"
                >
            <el-row>
                <el-col :span="12"  v-if="sessionTable !='jiashu'">
                    <el-form-item class="select" v-if="type!='info'"  label="家属" prop="jiashuId">
                        <el-select v-model="ruleForm.jiashuId" :disabled="ro.jiashuId" filterable placeholder="请选择家属" @change="jiashuChange">
                            <el-option
                                    v-for="(item,index) in jiashuOptions"
                                    v-bind:key="item.id"
                                    :label="item.jiashuName"
                                    :value="item.id">
                            </el-option>
                        </el-select>
                    </el-form-item>
                </el-col>

                <el-col :span="12"  v-if="sessionTable !='jiashu' ">
                    <el-form-item class="input" v-if="type!='info'"  label="家属编号" prop="jiashuUuidNumber">
                        <el-input v-model="jiashuForm.jiashuUuidNumber"
                                  placeholder="家属编号" clearable readonly></el-input>
                    </el-form-item>
                    <div v-else-if="type=='info'">
                        <el-form-item class="input" label="家属编号" prop="jiashuUuidNumber">
                            <el-input v-model="ruleForm.jiashuUuidNumber"
                                      placeholder="家属编号" readonly></el-input>
                        </el-form-item>
                    </div>
                </el-col>
                <el-col :span="12"  v-if="sessionTable !='jiashu' ">
                    <el-form-item class="input" v-if="type!='info'"  label="家属姓名" prop="jiashuName">
                        <el-input v-model="jiashuForm.jiashuName"
                                  placeholder="家属姓名" clearable readonly></el-input>
                    </el-form-item>
                    <div v-else-if="type=='info'">
                        <el-form-item class="input" label="家属姓名" prop="jiashuName">
                            <el-input v-model="ruleForm.jiashuName"
                                      placeholder="家属姓名" readonly></el-input>
                        </el-form-item>
                    </div>
                </el-col>
                <el-col :span="12"  v-if="sessionTable !='jiashu' ">
                    <el-form-item class="input" v-if="type!='info'"  label="家属手机号" prop="jiashuPhone">
                        <el-input v-model="jiashuForm.jiashuPhone"
                                  placeholder="家属手机号" clearable readonly></el-input>
                    </el-form-item>
                    <div v-else-if="type=='info'">
                        <el-form-item class="input" label="家属手机号" prop="jiashuPhone">
                            <el-input v-model="ruleForm.jiashuPhone"
                                      placeholder="家属手机号" readonly></el-input>
                        </el-form-item>
                    </div>
                </el-col>
                <el-col :span="12"  v-if="sessionTable !='jiashu' ">
                    <el-form-item class="input" v-if="type!='info'"  label="家属身份证号" prop="jiashuIdNumber">
                        <el-input v-model="jiashuForm.jiashuIdNumber"
                                  placeholder="家属身份证号" clearable readonly></el-input>
                    </el-form-item>
                    <div v-else-if="type=='info'">
                        <el-form-item class="input" label="家属身份证号" prop="jiashuIdNumber">
                            <el-input v-model="ruleForm.jiashuIdNumber"
                                      placeholder="家属身份证号" readonly></el-input>
                        </el-form-item>
                    </div>
                </el-col>
                <el-col :span="12" v-if="sessionTable !='jiashu' ">
                    <el-form-item class="upload" v-if="type!='info' && !ro.jiashuPhoto" label="家属头像" prop="jiashuPhoto">
                        <img style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in (jiashuForm.jiashuPhoto || '').split(',')" :src="$base.url+item" width="100" height="100">
                    </el-form-item>
                    <div v-else-if="type=='info'">
                        <el-form-item v-if="ruleForm.jiashuPhoto" label="家属头像" prop="jiashuPhoto">
                            <img style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in (ruleForm.jiashuPhoto || '').split(',')" :src="$base.url+item" width="100" height="100">
                        </el-form-item>
                    </div>
                </el-col>
                <el-col :span="12"  v-if="sessionTable !='jiashu' ">
                    <el-form-item class="input" v-if="type!='info'"  label="家属邮箱" prop="jiashuEmail">
                        <el-input v-model="jiashuForm.jiashuEmail"
                                  placeholder="家属邮箱" clearable readonly></el-input>
                    </el-form-item>
                    <div v-else-if="type=='info'">
                        <el-form-item class="input" label="家属邮箱" prop="jiashuEmail">
                            <el-input v-model="ruleForm.jiashuEmail"
                                      placeholder="家属邮箱" readonly></el-input>
                        </el-form-item>
                    </div>
                </el-col>
                <el-col :span="12"  v-if="sessionTable !='laoren'">
                    <el-form-item class="select" v-if="type!='info'"  label="老人" prop="laorenId">
                        <el-select v-model="ruleForm.laorenId" :disabled="ro.laorenId" filterable placeholder="请选择老人" @change="laorenChange">
                            <el-option
                                    v-for="(item,index) in laorenOptions"
                                    v-bind:key="item.id"
                                    :label="item.laorenName"
                                    :value="item.id">
                            </el-option>
                        </el-select>
                    </el-form-item>
                </el-col>

                <el-col :span="12"  v-if="sessionTable !='laoren' ">
                    <el-form-item class="input" v-if="type!='info'"  label="看护人姓名" prop="kanhurenName">
                        <el-input v-model="laorenForm.kanhurenName"
                                  placeholder="看护人姓名" clearable readonly></el-input>
                    </el-form-item>
                    <div v-else-if="type=='info'">
                        <el-form-item class="input" label="看护人姓名" prop="kanhurenName">
                            <el-input v-model="ruleForm.kanhurenName"
                                      placeholder="看护人姓名" readonly></el-input>
                        </el-form-item>
                    </div>
                </el-col>
                <el-col :span="12"  v-if="sessionTable !='laoren' ">
                    <el-form-item class="input" v-if="type!='info'"  label="看护人联系方式" prop="kanhurenPhone">
                        <el-input v-model="laorenForm.kanhurenPhone"
                                  placeholder="看护人联系方式" clearable readonly></el-input>
                    </el-form-item>
                    <div v-else-if="type=='info'">
                        <el-form-item class="input" label="看护人联系方式" prop="kanhurenPhone">
                            <el-input v-model="ruleForm.kanhurenPhone"
                                      placeholder="看护人联系方式" readonly></el-input>
                        </el-form-item>
                    </div>
                </el-col>
                <el-col :span="12"  v-if="sessionTable !='laoren' ">
                    <el-form-item class="input" v-if="type!='info'"  label="老人姓名" prop="laorenName">
                        <el-input v-model="laorenForm.laorenName"
                                  placeholder="老人姓名" clearable readonly></el-input>
                    </el-form-item>
                    <div v-else-if="type=='info'">
                        <el-form-item class="input" label="老人姓名" prop="laorenName">
                            <el-input v-model="ruleForm.laorenName"
                                      placeholder="老人姓名" readonly></el-input>
                        </el-form-item>
                    </div>
                </el-col>
                <el-col :span="12"  v-if="sessionTable !='laoren' ">
                    <el-form-item class="input" v-if="type!='info'"  label="老人手机号" prop="laorenPhone">
                        <el-input v-model="laorenForm.laorenPhone"
                                  placeholder="老人手机号" clearable readonly></el-input>
                    </el-form-item>
                    <div v-else-if="type=='info'">
                        <el-form-item class="input" label="老人手机号" prop="laorenPhone">
                            <el-input v-model="ruleForm.laorenPhone"
                                      placeholder="老人手机号" readonly></el-input>
                        </el-form-item>
                    </div>
                </el-col>
                <el-col :span="12"  v-if="sessionTable !='laoren' ">
                    <el-form-item class="input" v-if="type!='info'"  label="老人身份证号" prop="laorenIdNumber">
                        <el-input v-model="laorenForm.laorenIdNumber"
                                  placeholder="老人身份证号" clearable readonly></el-input>
                    </el-form-item>
                    <div v-else-if="type=='info'">
                        <el-form-item class="input" label="老人身份证号" prop="laorenIdNumber">
                            <el-input v-model="ruleForm.laorenIdNumber"
                                      placeholder="老人身份证号" readonly></el-input>
                        </el-form-item>
                    </div>
                </el-col>
                <el-col :span="12"  v-if="sessionTable !='laoren' ">
                    <el-form-item class="input" v-if="type!='info'"  label="性别" prop="sexValue">
                        <el-input v-model="laorenForm.sexValue"
                                  placeholder="性别" clearable readonly></el-input>
                    </el-form-item>
                    <div v-else-if="type=='info'">
                        <el-form-item class="input" label="性别" prop="sexValue">
                            <el-input v-model="ruleForm.sexValue"
                                      placeholder="性别" readonly></el-input>
                        </el-form-item>
                    </div>
                </el-col>
                <el-col :span="12"  v-if="sessionTable !='laoren' ">
                    <el-form-item class="input" v-if="type!='info'"  label="年龄" prop="age">
                        <el-input v-model="laorenForm.age"
                                  placeholder="年龄" clearable readonly></el-input>
                    </el-form-item>
                    <div v-else-if="type=='info'">
                        <el-form-item class="input" label="年龄" prop="age">
                            <el-input v-model="ruleForm.age"
                                      placeholder="年龄" readonly></el-input>
                        </el-form-item>
                    </div>
                </el-col>
                <el-col :span="12" v-if="sessionTable !='laoren' ">
                    <el-form-item class="upload" v-if="type!='info' && !ro.laorenPhoto" label="老人照片" prop="laorenPhoto">
                        <img style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in (laorenForm.laorenPhoto || '').split(',')" :src="$base.url+item" width="100" height="100">
                    </el-form-item>
                    <div v-else-if="type=='info'">
                        <el-form-item v-if="ruleForm.laorenPhoto" label="老人照片" prop="laorenPhoto">
                            <img style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in (ruleForm.laorenPhoto || '').split(',')" :src="$base.url+item" width="100" height="100">
                        </el-form-item>
                    </div>
                </el-col>
                <input id="updateId" name="id" type="hidden">
               <el-col :span="12">
                   <el-form-item class="input" v-if="type!='info'"  label="报名编号" prop="laorenqingjiaUuidNumber">
                       <el-input v-model="ruleForm.laorenqingjiaUuidNumber"
                                 placeholder="报名编号" clearable  :readonly="ro.laorenqingjiaUuidNumber"></el-input>
                   </el-form-item>
                   <div v-else-if="type=='info'">
                       <el-form-item class="input" label="报名编号" prop="laorenqingjiaUuidNumber">
                           <el-input v-model="ruleForm.laorenqingjiaUuidNumber"
                                     placeholder="报名编号" readonly></el-input>
                       </el-form-item>
                   </div>
               </el-col>
            <input id="jiashuId" name="jiashuId" type="hidden">
            <input id="laorenId" name="laorenId" type="hidden">
                <el-col :span="24">
                    <el-form-item v-if="type!='info'"  label="报名理由" prop="laorenqingjiaText">
                        <el-input type="textarea"  :readonly="ro.laorenqingjiaText" v-model="ruleForm.laorenqingjiaText" placeholder="报名理由"></el-input>
                    </el-form-item>
                    <div v-else-if="type=='info'">
                        <el-form-item v-if="ruleForm.laorenqingjiaText" label="报名理由" prop="laorenqingjiaText">
                            <span v-html="ruleForm.laorenqingjiaText"></span>
                        </el-form-item>
                    </div>
                </el-col>
            <el-col :span="12" v-if="type=='info'">
                <div>
                    <el-form-item v-if="ruleForm.laorenqingjiaYesnoTypes" label="报名状态" prop="laorenqingjiaYesnoTypes">
                        <el-input v-model="ruleForm.laorenqingjiaYesnoValue" placeholder="报名状态" readonly></el-input>
                    </el-form-item>
                </div>
            </el-col>
            <el-col :span="12" v-if="type=='info'">
                <div>
                    <el-form-item v-if="ruleForm.laorenqingjiaYesnoText" label="审核回复" prop="laorenqingjiaYesnoText">
                        <span v-html="ruleForm.laorenqingjiaYesnoText"></span>
                    </el-form-item>
                </div>
            </el-col>
            <el-col :span="12" v-if="type=='info'">
                <div>
                    <el-form-item v-if="ruleForm.laorenqingjiaShenheTime" label="审核时间" prop="laorenqingjiaShenheTime">
                        <span v-html="ruleForm.laorenqingjiaShenheTime"></span>
                    </el-form-item>
                </div>
            </el-col>
            </el-row>
            <el-form-item class="btn">
                <el-button v-if="type!='info'" type="primary" class="btn-success" @click="onSubmit">提交</el-button>
                <el-button v-if="type!='info'" class="btn-close" @click="back()">取消</el-button>
                <el-button v-if="type=='info'" class="btn-close" @click="back()">返回</el-button>
            </el-form-item>
        </el-form>
    </div>
</template>
<script>
    import styleJs from "../../../utils/style.js";
    // 数字，邮件，手机，url，身份证校验
    import { isNumber,isIntNumer,isEmail,isPhone, isMobile,isURL,checkIdCard } from "@/utils/validate";
    import utilsJs, {getYearFormat,getMonthFormat,getDateFormat,getDatetimeFormat} from "../../../utils/utils.js";
    export default {
        data() {
            return {
                addEditForm:null,
                id: '',
                type: '',
                sessionTable : "",//登录账户所在表名
                role : "",//权限
                userId:"",//当前登录人的id
                jiashuForm: {},
                laorenForm: {},
                ro:{
                    laorenqingjiaUuidNumber: true,
                    jiashuId: false,
                    laorenId: false,
                    laorenqingjiaText: false,
                    insertTime: false,
                    laorenqingjiaYesnoTypes: false,
                    laorenqingjiaYesnoText: false,
                    laorenqingjiaShenheTime: false,
                },
                ruleForm: {
                    laorenqingjiaUuidNumber: new Date().getTime(),
                    jiashuId: '',
                    laorenId: '',
                    laorenqingjiaText: '',
                    insertTime: '',
                    laorenqingjiaYesnoTypes: '',
                    laorenqingjiaYesnoText: '',
                    laorenqingjiaShenheTime: '',
                },
                laorenqingjiaYesnoTypesOptions : [],
                jiashuOptions : [],
                laorenOptions : [],
                rules: {
                   laorenqingjiaUuidNumber: [
                              { required: true, message: '报名编号不能为空', trigger: 'blur' },
                          ],
                   jiashuId: [
                              { required: true, message: '家属不能为空', trigger: 'blur' },
                              {  pattern: /^[0-9]*$/,
                                  message: '只允许输入整数',
                                  trigger: 'blur'
                              }
                          ],
                   laorenId: [
                              { required: true, message: '老人不能为空', trigger: 'blur' },
                              {  pattern: /^[0-9]*$/,
                                  message: '只允许输入整数',
                                  trigger: 'blur'
                              }
                          ],
                   laorenqingjiaText: [
                              { required: true, message: '报名理由不能为空', trigger: 'blur' },
                          ],
                   insertTime: [
                              { required: true, message: '老人请假申请时间不能为空', trigger: 'blur' },
                          ],
                   laorenqingjiaYesnoTypes: [
                              { required: true, message: '报名状态不能为空', trigger: 'blur' },
                              {  pattern: /^[0-9]*$/,
                                  message: '只允许输入整数',
                                  trigger: 'blur'
                              }
                          ],
                   laorenqingjiaYesnoText: [
                              { required: true, message: '审核回复不能为空', trigger: 'blur' },
                          ],
                   laorenqingjiaShenheTime: [
                              { required: true, message: '审核时间不能为空', trigger: 'blur' },
                          ],
                }
            };
        },
        props: ["parent"],
        computed: {
        },
        created() {
            //获取当前登录用户的信息
            this.sessionTable = this.$storage.get("sessionTable");
            this.role = this.$storage.get("role");
            this.userId = this.$storage.get("userId");


            if (this.role != "管理员"){
            }else{
            }
            this.addEditForm = styleJs.addStyle();
            this.addEditStyleChange()
            this.addEditUploadStyleChange()
            //获取下拉框信息
                this.$http({
                    url:`dictionary/page?page=1&limit=100&sort=&order=&dicCode=laorenqingjia_yesno_types`,
                    method: "get"
                }).then(({ data }) => {
                    if (data && data.code === 0) {
                        this.laorenqingjiaYesnoTypesOptions = data.data.list;
                    }
                });

         this.$http({
             url: `jiashu/page?page=1&limit=100`,
             method: "get"
         }).then(({ data }) => {
             if (data && data.code === 0) {
                this.jiashuOptions = data.data.list;
            }
         });
         this.$http({
             url: `laoren/page?page=1&limit=100`,
             method: "get"
         }).then(({ data }) => {
             if (data && data.code === 0) {
                this.laorenOptions = data.data.list;
            }
         });

        },
        mounted() {
        },
        methods: {
            // 下载
            download(file){
                window.open(`${file}`)
            },
            // 初始化
            init(id,type) {
                if (id) {
                    this.id = id;
                    this.type = type;
                }
                if(this.type=='info'||this.type=='else'){
                    this.info(id);
                }
                // 获取用户信息
                this.$http({
                    url:`${this.$storage.get("sessionTable")}/session`,
                    method: "get"
                }).then(({ data }) => {
                    if (data && data.code === 0) {
                        var json = data.data;
                    } else {
                        this.$message.error(data.msg);
                    }
                });
            },
            jiashuChange(id){
                this.$http({
                    url: `jiashu/info/`+id,
                    method: "get"
                }).then(({ data }) => {
                    if (data && data.code === 0) {
                        this.jiashuForm = data.data;
                    }
                });
            },
            laorenChange(id){
                this.$http({
                    url: `laoren/info/`+id,
                    method: "get"
                }).then(({ data }) => {
                    if (data && data.code === 0) {
                        this.laorenForm = data.data;
                    }
                });
            },
            // 多级联动参数
            info(id) {
                let _this =this;
                _this.$http({
                    url: `laorenqingjia/info/${id}`,
                    method: 'get'
                }).then(({ data }) => {
                    if (data && data.code === 0) {
                        _this.ruleForm = data.data;
                        _this.jiashuChange(data.data.jiashuId)
                        _this.laorenChange(data.data.laorenId)
                    } else {
                        _this.$message.error(data.msg);
                    }
                });
            },
            // 提交
            onSubmit() {
                this.$refs["ruleForm"].validate(valid => {
                    if (valid) {
                        this.$http({
                            url:`laorenqingjia/${!this.ruleForm.id ? "save" : "update"}`,
                            method: "post",
                            data: this.ruleForm
                        }).then(({ data }) => {
                            if (data && data.code === 0) {
                                this.$message({
                                    message: "操作成功",
                                    type: "success",
                                    duration: 1500,
                                    onClose: () => {
                                        this.parent.showFlag = true;
                                        this.parent.addOrUpdateFlag = false;
                                        this.parent.laorenqingjiaCrossAddOrUpdateFlag = false;
                                        this.parent.search();
                                        this.parent.contentStyleChange();
                                    }
                                });
                            } else {
                                this.$message.error(data.msg);
                            }
                        });
                    }
                });
            },
            // 获取uuid
            getUUID () {
                return new Date().getTime();
            },
            // 返回
            back() {
                this.parent.showFlag = true;
                this.parent.addOrUpdateFlag = false;
                this.parent.laorenqingjiaCrossAddOrUpdateFlag = false;
                this.parent.contentStyleChange();
            },
            //图片

            addEditStyleChange() {
                this.$nextTick(()=>{
                    // input
                    document.querySelectorAll('.addEdit-block .input .el-input__inner').forEach(el=>{
                        el.style.height = this.addEditForm.inputHeight
                        el.style.color = this.addEditForm.inputFontColor
                        el.style.fontSize = this.addEditForm.inputFontSize
                        el.style.borderWidth = this.addEditForm.inputBorderWidth
                        el.style.borderStyle = this.addEditForm.inputBorderStyle
                        el.style.borderColor = this.addEditForm.inputBorderColor
                        el.style.borderRadius = this.addEditForm.inputBorderRadius
                        el.style.backgroundColor = this.addEditForm.inputBgColor
                    })
                    document.querySelectorAll('.addEdit-block .input .el-form-item__label').forEach(el=>{
                        el.style.lineHeight = this.addEditForm.inputHeight
                        el.style.color = this.addEditForm.inputLableColor
                        el.style.fontSize = this.addEditForm.inputLableFontSize
                    })
                    // select
                    document.querySelectorAll('.addEdit-block .select .el-input__inner').forEach(el=>{
                        el.style.height = this.addEditForm.selectHeight
                        el.style.color = this.addEditForm.selectFontColor
                        el.style.fontSize = this.addEditForm.selectFontSize
                        el.style.borderWidth = this.addEditForm.selectBorderWidth
                        el.style.borderStyle = this.addEditForm.selectBorderStyle
                        el.style.borderColor = this.addEditForm.selectBorderColor
                        el.style.borderRadius = this.addEditForm.selectBorderRadius
                        el.style.backgroundColor = this.addEditForm.selectBgColor
                    })
                    document.querySelectorAll('.addEdit-block .select .el-form-item__label').forEach(el=>{
                        el.style.lineHeight = this.addEditForm.selectHeight
                        el.style.color = this.addEditForm.selectLableColor
                        el.style.fontSize = this.addEditForm.selectLableFontSize
                    })
                    document.querySelectorAll('.addEdit-block .select .el-select__caret').forEach(el=>{
                        el.style.color = this.addEditForm.selectIconFontColor
                        el.style.fontSize = this.addEditForm.selectIconFontSize
                    })
                    // date
                    document.querySelectorAll('.addEdit-block .date .el-input__inner').forEach(el=>{
                        el.style.height = this.addEditForm.dateHeight
                        el.style.color = this.addEditForm.dateFontColor
                        el.style.fontSize = this.addEditForm.dateFontSize
                        el.style.borderWidth = this.addEditForm.dateBorderWidth
                        el.style.borderStyle = this.addEditForm.dateBorderStyle
                        el.style.borderColor = this.addEditForm.dateBorderColor
                        el.style.borderRadius = this.addEditForm.dateBorderRadius
                        el.style.backgroundColor = this.addEditForm.dateBgColor
                    })
                    document.querySelectorAll('.addEdit-block .date .el-form-item__label').forEach(el=>{
                        el.style.lineHeight = this.addEditForm.dateHeight
                        el.style.color = this.addEditForm.dateLableColor
                        el.style.fontSize = this.addEditForm.dateLableFontSize
                    })
                    document.querySelectorAll('.addEdit-block .date .el-input__icon').forEach(el=>{
                        el.style.color = this.addEditForm.dateIconFontColor
                        el.style.fontSize = this.addEditForm.dateIconFontSize
                        el.style.lineHeight = this.addEditForm.dateHeight
                    })
                    // upload
                    let iconLineHeight = parseInt(this.addEditForm.uploadHeight) - parseInt(this.addEditForm.uploadBorderWidth) * 2 + 'px'
                    document.querySelectorAll('.addEdit-block .upload .el-upload--picture-card').forEach(el=>{
                        el.style.width = this.addEditForm.uploadHeight
                        el.style.height = this.addEditForm.uploadHeight
                        el.style.borderWidth = this.addEditForm.uploadBorderWidth
                        el.style.borderStyle = this.addEditForm.uploadBorderStyle
                        el.style.borderColor = this.addEditForm.uploadBorderColor
                        el.style.borderRadius = this.addEditForm.uploadBorderRadius
                        el.style.backgroundColor = this.addEditForm.uploadBgColor
                    })
                    document.querySelectorAll('.addEdit-block .upload .el-form-item__label').forEach(el=>{
                        el.style.lineHeight = this.addEditForm.uploadHeight
                        el.style.color = this.addEditForm.uploadLableColor
                        el.style.fontSize = this.addEditForm.uploadLableFontSize
                    })
                    document.querySelectorAll('.addEdit-block .upload .el-icon-plus').forEach(el=>{
                        el.style.color = this.addEditForm.uploadIconFontColor
                        el.style.fontSize = this.addEditForm.uploadIconFontSize
                        el.style.lineHeight = iconLineHeight
                        el.style.display = 'block'
                    })
                    // 多文本输入框
                    document.querySelectorAll('.addEdit-block .textarea .el-textarea__inner').forEach(el=>{
                        el.style.height = this.addEditForm.textareaHeight
                        el.style.color = this.addEditForm.textareaFontColor
                        el.style.fontSize = this.addEditForm.textareaFontSize
                        el.style.borderWidth = this.addEditForm.textareaBorderWidth
                        el.style.borderStyle = this.addEditForm.textareaBorderStyle
                        el.style.borderColor = this.addEditForm.textareaBorderColor
                        el.style.borderRadius = this.addEditForm.textareaBorderRadius
                        el.style.backgroundColor = this.addEditForm.textareaBgColor
                    })
                    document.querySelectorAll('.addEdit-block .textarea .el-form-item__label').forEach(el=>{
                        // el.style.lineHeight = this.addEditForm.textareaHeight
                        el.style.color = this.addEditForm.textareaLableColor
                        el.style.fontSize = this.addEditForm.textareaLableFontSize
                    })
                    // 保存
                    document.querySelectorAll('.addEdit-block .btn .btn-success').forEach(el=>{
                        el.style.width = this.addEditForm.btnSaveWidth
                        el.style.height = this.addEditForm.btnSaveHeight
                        el.style.color = this.addEditForm.btnSaveFontColor
                        el.style.fontSize = this.addEditForm.btnSaveFontSize
                        el.style.borderWidth = this.addEditForm.btnSaveBorderWidth
                        el.style.borderStyle = this.addEditForm.btnSaveBorderStyle
                        el.style.borderColor = this.addEditForm.btnSaveBorderColor
                        el.style.borderRadius = this.addEditForm.btnSaveBorderRadius
                        el.style.backgroundColor = this.addEditForm.btnSaveBgColor
                    })
                    // 返回
                    document.querySelectorAll('.addEdit-block .btn .btn-close').forEach(el=>{
                        el.style.width = this.addEditForm.btnCancelWidth
                        el.style.height = this.addEditForm.btnCancelHeight
                        el.style.color = this.addEditForm.btnCancelFontColor
                        el.style.fontSize = this.addEditForm.btnCancelFontSize
                        el.style.borderWidth = this.addEditForm.btnCancelBorderWidth
                        el.style.borderStyle = this.addEditForm.btnCancelBorderStyle
                        el.style.borderColor = this.addEditForm.btnCancelBorderColor
                        el.style.borderRadius = this.addEditForm.btnCancelBorderRadius
                        el.style.backgroundColor = this.addEditForm.btnCancelBgColor
                    })
                })
            },
            addEditUploadStyleChange() {
                this.$nextTick(()=>{
                    document.querySelectorAll('.addEdit-block .upload .el-upload-list--picture-card .el-upload-list__item').forEach(el=>{
                        el.style.width = this.addEditForm.uploadHeight
                        el.style.height = this.addEditForm.uploadHeight
                        el.style.borderWidth = this.addEditForm.uploadBorderWidth
                        el.style.borderStyle = this.addEditForm.uploadBorderStyle
                        el.style.borderColor = this.addEditForm.uploadBorderColor
                        el.style.borderRadius = this.addEditForm.uploadBorderRadius
                        el.style.backgroundColor = this.addEditForm.uploadBgColor
                    })
                })
            },
        }
    };
</script>
<style lang="scss">
.editor{
  height: 500px;

  & /deep/ .ql-container {
	  height: 310px;
  }
}
.amap-wrapper {
  width: 100%;
  height: 500px;
}
.search-box {
  position: absolute;
}
.addEdit-block {
	margin: -10px;
}
.detail-form-content {
	padding: 12px;
	background-color: transparent;
}
.btn .el-button {
  padding: 0;
}</style>


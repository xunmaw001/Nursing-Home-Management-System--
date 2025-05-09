const menu = {
    list() {
        return [
    {
        "backMenu":[
        ],
        "frontMenu":[
        ],
        "hasBackLogin":"是",
        "hasBackRegister":"否",
        "hasFrontLogin":"否",
        "hasFrontRegister":"否",
        "roleName":"管理员",
        "tableName":"users"
    },
    {
        "backMenu":[
			{
                "child":[
                    {
						"appFrontIcon":"cuIcon-form",
                        "buttons":[
                            "查看",
                        ],
                        "menu":"床位",
                        "menuJump":"列表",
                        "tableName":"chuangwei"
                    }
                ],
                "menu":"床位"
            }
			,
			{
                "child":[
                    {
						"appFrontIcon":"cuIcon-form",
                        "buttons":[
                            "查看",
                            "新增",
                        ],
                        "menu":"床位调动申请",
                        "menuJump":"列表",
                        "tableName":"chuangweiYuyue"
                    }
                ],
                "menu":"床位调动申请"
            }
			,
			{
                "child":[
                    {
						"appFrontIcon":"cuIcon-form",
                        "buttons":[
                            "查看",
                        ],
                        "menu":"房间",
                        "menuJump":"列表",
                        "tableName":"fangjian"
                    }
                ],
                "menu":"房间"
            }
			,
			{
                "child":[
                    {
						"appFrontIcon":"cuIcon-form",
                        "buttons":[
                            "查看",
                        ],
                        "menu":"公告信息",
                        "menuJump":"列表",
                        "tableName":"gonggao"
                    }
                ],
                "menu":"公告信息"
            }
			,
			{
                "child":[
                    {
						"appFrontIcon":"cuIcon-form",
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                        ],
                        "menu":"健康信息",
                        "menuJump":"列表",
                        "tableName":"jilu"
                    }
                ],
                "menu":"健康信息"
            }
			,
			{
                "child":[
                    {
						"appFrontIcon":"cuIcon-form",
                        "buttons":[
                            "查看",
                        ],
                        "menu":"老人",
                        "menuJump":"列表",
                        "tableName":"laoren"
                    }
                ],
                "menu":"老人"
            }
			,
			{
                "child":[
                    {
						"appFrontIcon":"cuIcon-form",
                        "buttons":[
                            "查看",
                            "新增",
                        ],
                        "menu":"离职申请",
                        "menuJump":"列表",
                        "tableName":"lizhi"
                    }
                ],
                "menu":"离职申请"
            }
			,
			{
                "child":[
                    {
						"appFrontIcon":"cuIcon-form",
                        "buttons":[
                            "查看",
                            "新增",
                        ],
                        "menu":"请假申请",
                        "menuJump":"列表",
                        "tableName":"qingjia"
                    }
                ],
                "menu":"请假申请"
            }
        ],
        "frontMenu":[
        ],
        "hasBackLogin":"是",
        "hasBackRegister":"否",
        "hasFrontLogin":"是",
        "hasFrontRegister":"是",
        "roleName":"护工",
        "tableName":"yonghu"
    }
]

	}
}
export default menu;

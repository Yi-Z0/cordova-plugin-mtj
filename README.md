# cordova-plugin-mtj

百度统计 for cordova (android)

## 安装
`cordova plugin add cordova-plugin-mtj  --variable MTJ_STAT_ID=your_mtj_android_app_id --variable MTJ_CHANNEL=Self --save`

## 使用
```
window.gdt.pageStart('pagename')
window.gdt.pageEnd('pagename')
window.gdt.event('label','desc')
```

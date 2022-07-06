# Fast Food
A simple mod where fast food are added to minecraft using Fabric API and Java.

## Installation
Fast Food is a mod built for the [Fabric Loader](https://fabricmc.net/). It requires [Fabric API](https://www.curseforge.com/minecraft/mc-mods/fabric-api) to be installed; all other dependencies are installed with the mod.

For setup instructions please see the [fabric wiki page](https://fabricmc.net/wiki/tutorial:setup) that relates to the IDE that you are using.

## At a Glance

### Food and ingredients

|Fast Food | Ingredients| 
|----------|------------|
![image](https://user-images.githubusercontent.com/75272665/177467249-7ae7ca45-e337-4c0e-8415-046102b8c885.png) | ![image](https://user-images.githubusercontent.com/75272665/177465948-9ca0ff62-4f08-491c-8991-1bb0d9fa087c.png)

### Recipes

Pizza | Hamburger | Taco
:-------------------------:|:-------------------------:|:-------------------------:
![image](https://user-images.githubusercontent.com/75272665/177466464-9d2853e4-4b5c-45d8-974d-50f7fc4391fd.png) | ![crafting-grid (3)](https://user-images.githubusercontent.com/75272665/177466793-c8396781-9a1f-41ad-94cb-4ca691b6d543.png) | ![crafting-grid (5)](https://user-images.githubusercontent.com/75272665/177466966-ba058661-4342-4e83-86ca-8d95580f9286.png)

Chocolate Bar | French Fries | Soda
:-------------------------:|:-------------------------:|:-------------------------:
![crafting-grid (1)](https://user-images.githubusercontent.com/75272665/177466590-a271c6b3-aff1-4000-be4a-637ee87c36f0.png) | ![crafting-grid (2)](https://user-images.githubusercontent.com/75272665/177466649-98c8c4bf-d78a-4361-b572-506bf941416f.png) | ![crafting-grid (4)](https://user-images.githubusercontent.com/75272665/177466869-ae0612a8-780d-4b68-aead-60ba6edbb991.png)

### Foods Stats

Name | Icon | Food Points | Saturation Restored | Effects 
:-------------------------:|:-------------------------:|:-------------------------:|:-------------------------:|:-------------------------:|
Pizza | ![image](https://user-images.githubusercontent.com/75272665/177469008-40956614-e9a0-4b99-a38c-e3e73ff4ec38.png) | 8 (![image](https://user-images.githubusercontent.com/75272665/177469104-1334e415-5d89-4568-948c-dc6bad62c202.png)![image](https://user-images.githubusercontent.com/75272665/177469128-4a9397f8-ad0b-444c-a50f-02b41eaa159d.png)![image](https://user-images.githubusercontent.com/75272665/177469134-fee2dc43-e111-4bcf-a61f-3f851de5572a.png)![image](https://user-images.githubusercontent.com/75272665/177469140-073ca9f3-f937-4666-ad7e-b5f5752c3f01.png)) | 6 | ![image](https://user-images.githubusercontent.com/75272665/177469628-9ce667db-f2d8-4460-9a0b-136ed041e7d3.png) Speed III for 15 seconds ![image](https://user-images.githubusercontent.com/75272665/177469501-6f110b24-86c9-45d6-b170-a04e430106aa.png) Resistence for 15 seconds ![image](https://user-images.githubusercontent.com/75272665/177470651-b92d756e-dedc-4d32-91d5-6326772d1123.png) Jump Boost for 15 seconds
Hamburger |![image](https://user-images.githubusercontent.com/75272665/177644705-c2a7af45-6140-41d9-aa69-26f59967308f.png)| 10(![image](https://user-images.githubusercontent.com/75272665/177469104-1334e415-5d89-4568-948c-dc6bad62c202.png)![image](https://user-images.githubusercontent.com/75272665/177469128-4a9397f8-ad0b-444c-a50f-02b41eaa159d.png)![image](https://user-images.githubusercontent.com/75272665/177469134-fee2dc43-e111-4bcf-a61f-3f851de5572a.png)![image](https://user-images.githubusercontent.com/75272665/177469140-073ca9f3-f937-4666-ad7e-b5f5752c3f01.png)) | 6 | ![image](https://user-images.githubusercontent.com/75272665/177469628-9ce667db-f2d8-4460-9a0b-136ed041e7d3.png) Speed III for 15 seconds ![image](https://user-images.githubusercontent.com/75272665/177469501-6f110b24-86c9-45d6-b170-a04e430106aa.png) Resistence for 15 seconds ![image](https://user-images.githubusercontent.com/75272665/177470651-b92d756e-dedc-4d32-91d5-6326772d1123.png) Jump Boost for 15 seconds
Taco | ![image](https://user-images.githubusercontent.com/75272665/177645002-ed2ea86c-4c93-4e1a-becf-740083a1f1b6.png) | 6 (![image](https://user-images.githubusercontent.com/75272665/177469104-1334e415-5d89-4568-948c-dc6bad62c202.png)![image](https://user-images.githubusercontent.com/75272665/177469128-4a9397f8-ad0b-444c-a50f-02b41eaa159d.png)![image](https://user-images.githubusercontent.com/75272665/177469134-fee2dc43-e111-4bcf-a61f-3f851de5572a.png)) | 6 | ![image](https://user-images.githubusercontent.com/75272665/177469628-9ce667db-f2d8-4460-9a0b-136ed041e7d3.png) Speed III for 15 seconds ![image](https://user-images.githubusercontent.com/75272665/177469501-6f110b24-86c9-45d6-b170-a04e430106aa.png) Resistence for 15 seconds ![image](https://user-images.githubusercontent.com/75272665/177470651-b92d756e-dedc-4d32-91d5-6326772d1123.png) Jump Boost for 15 seconds
Chocolate Bar | ![image](https://user-images.githubusercontent.com/75272665/177645064-888dc186-38fc-49e1-81cb-4c4693803ff1.png) | 4 (![image](https://user-images.githubusercontent.com/75272665/177469104-1334e415-5d89-4568-948c-dc6bad62c202.png)![image](https://user-images.githubusercontent.com/75272665/177469128-4a9397f8-ad0b-444c-a50f-02b41eaa159d.png)) | 3 | ![image](https://user-images.githubusercontent.com/75272665/177469628-9ce667db-f2d8-4460-9a0b-136ed041e7d3.png) Speed III for 15 seconds ![image](https://user-images.githubusercontent.com/75272665/177469501-6f110b24-86c9-45d6-b170-a04e430106aa.png) Resistence for 15 seconds ![image](https://user-images.githubusercontent.com/75272665/177470651-b92d756e-dedc-4d32-91d5-6326772d1123.png) Jump Boost for 15 seconds
French Fries | ![image](https://user-images.githubusercontent.com/75272665/177645157-5810360b-7ddc-461b-86c5-6fb684959a62.png) | 4 (![image](https://user-images.githubusercontent.com/75272665/177469104-1334e415-5d89-4568-948c-dc6bad62c202.png)![image](https://user-images.githubusercontent.com/75272665/177469128-4a9397f8-ad0b-444c-a50f-02b41eaa159d.png)) | 4 | ![image](https://user-images.githubusercontent.com/75272665/177469628-9ce667db-f2d8-4460-9a0b-136ed041e7d3.png) Speed III for 15 seconds ![image](https://user-images.githubusercontent.com/75272665/177469501-6f110b24-86c9-45d6-b170-a04e430106aa.png) Resistence for 15 seconds ![image](https://user-images.githubusercontent.com/75272665/177470651-b92d756e-dedc-4d32-91d5-6326772d1123.png) Jump Boost for 15 seconds
Soda | ![image](https://user-images.githubusercontent.com/75272665/177645194-87d1b4c2-c358-4dc6-a4c9-61767e37dd37.png) | 8 (![image](https://user-images.githubusercontent.com/75272665/177469104-1334e415-5d89-4568-948c-dc6bad62c202.png)![image](https://user-images.githubusercontent.com/75272665/177469128-4a9397f8-ad0b-444c-a50f-02b41eaa159d.png)) | 2 | ![image](https://user-images.githubusercontent.com/75272665/177469628-9ce667db-f2d8-4460-9a0b-136ed041e7d3.png) Speed III for 15 seconds ![image](https://user-images.githubusercontent.com/75272665/177469501-6f110b24-86c9-45d6-b170-a04e430106aa.png) Resistence for 15 seconds ![image](https://user-images.githubusercontent.com/75272665/177470651-b92d756e-dedc-4d32-91d5-6326772d1123.png) Jump Boost for 15 seconds


### License
Fast Food is licensed under GPLv3.


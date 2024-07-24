گزارش کار آزمایش دوم
### گام ۱: افزودن یک سرویس پرداخت و سفارش دیگر

<table dir='rtl'>
<tbody>
<tr>
<td width="64">
<p><strong>ردیف</strong></p>
</td>
<td width="198">
<p><strong>محل اعمال تغییرات (کلاس/واسط)</strong></p>
</td>
<td width="141">
<p><strong>عنوان تغییر</strong></p>
</td>
<td width="292">
<p><strong>شرحی کوتاه از تغییر</strong></p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>1</strong></p>
</td>
<td width="198">
<p>OnlineOrderService</p>
</td>
<td width="141">
<p>افزودن تابع ثبت سفارش تلفنی</p>
</td>
<td width="292">
<p>افزودن یک تابع void با عنوان phoneOrderRegister</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>2</strong></p>
</td>
<td width="198">
<p>OnlineOrderService</p>
</td>
<td width="141">
<p>افزودن تابع پرداخت تلفنی</p>
</td>
<td width="292">
<p>افزودن یک تابع void با عنوان phoneOrderPayment</p>
</tr>

<tr>
<td width="64">
<p><strong>3</strong></p>
</td>
<td width="198">
<p>OnSiteOrderService</p>
</td>
<td width="141">
<p>افزودن تابع ثبت سفارش تلفنی</p>
</td>
<td width="292">
<p>افزودن یک تابع void با عنوان phoneOrderRegister</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>4</strong></p>
</td>
<td width="198">
<p>OnSiteOrderService</p>
</td>
<td width="141">
<p>افزودن تابع پرداخت تلفنی</p>
</td>
<td width="292">
<p>افزودن یک تابع void با عنوان phoneOrderPayment</p>
</tr>
<tr>
<td width="64">
<p><strong>5</strong></p>
</td>
<td width="198">
<p>PhoneOrderService</p>
</td>
<td width="141">
<p>افزودن یک کلاس برای ثبت سفارش و پرداخت تلفنی</p>
</td>
<td width="292">
<p>افزودن یک کلاس با عنوان PhoneOrderService که امکان ثبت سفارش و پرداخت تلفنی را فراهم می‌کند</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>6</strong></p>
</td>
<td width="198">
<p>Main</p>
</td>
<td width="141">
<p>تغییر  print  اطلاع به کاربر</p>
</td>
<td width="292">
<p>تغییر command prompt برای مظلع کردن کاربر از شماره سرویس تلفنی</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>7</strong></p>
</td>
<td width="198">
<p>Main</p>
</td>
<td width="141">
<p>افزودن else if مربوط به سرویس تلفنی در</p>
</td>
<td width="292">
<p>در if else، کد مربوط به ورودی گرفتن آیدی سرویس تلفنی اضافه شد</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>8</strong></p>
</td>
<td width="198">
<p>Main</p>
</td>
<td width="141">
<p>صدا زدن سرویس مربوط به درخواست ثبت سفارش تلفنی</p>
</td>
<td width="292">
<p>برای ثبت سفارش تلفنی، تابع مربوطه از کلاس PhoneOrderService را صدا می‌زنیم</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>9</strong></p>
</td>
<td width="198">
<p>OrderService</p>
</td>
<td width="141">
<p>افزودن تابع ثبت سفارش تلفنی</p>
</td>
<td width="292">
<p>افزودن یک تابع void با عنوان phoneOrderRegister</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>10</strong></p>
</td>
<td width="198">
<p>OrderService</p>
</td>
<td width="141">
<p>افزودن تابع پرداخت تلفنی</p>
</td>
<td width="292">
<p>افزودن یک تابع void با عنوان phoneOrderPayment</p>
</td>
</tr>
</tbody>
</table>

### گام ۲: تحلیل و وارسی برنامه از منظر تحقق و یا عدم تحقق اصول SOLID

<table dir='rtl'>
<tbody>
<tr>
<td rowspan="2" width="240">
<p>اصل 1</p>
<p>Single Responsibility</p>
</td>
<td width="95">
<p><strong>موارد تحقق</strong></p>
</td>
<td width="454">
<p></p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>کارآیی اصلی برنامه شامل گرفتن ورودی و ساخت و ارسال پیام تنها در یک تابع main در کلاس Main قرار داده شده است.
<br/>
<br/>
در کلاس OnlineOrderService توابع phoneOrderRegister و onSiteOrderRegister و onSiteOrderPayment و phoneOrderPayment پیاده سازی شده است که ربطی به وظیفه اصلی کلاس ندارد.
<br/>
<br/>
در کلاس OnSiteOrderService توابع phoneOrderRegister و onlineOrderRegister و onlineOrderPayment و phoneOrderPayment پیاده سازی شده است که ربطی به وظیفه اصلی کلاس ندارد.
<br/>
<br/>
در کلاس PhoneOrderService توابع onSiteOrderRegister و onlineOrderRegister و onlineOrderPayment و onSiteOrderPayment پیاده سازی شده است که ربطی به وظیفه اصلی کلاس ندارد.
</p>

</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 2</p>
<p>Open-Close Principle (OCP)</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>برای تحقق OCP از DIP استفاده می‌کنیم اما در اینجا DIP نقض شده است زیرا کلاس Main برای ثبت سفارش و پرداخت آن به طور مستقیم با توابع مربوط به سرویس‌ها کار می‌کند به جای اینکه از واسط OrderService استفاده کند. به عبارت دیگر کلاس‌ها از طریق abstraction باید به یکدیگر وابسته باشند اما در اینجا این مورد رعایت نشده است. همچنین برای اضافه کردن یک کلاس سرویس جدید نیاز است یک تابع جدید در واسط OrderService تعریف کنیم که منجر به تغییر در تمام کلاس‌های سرویس موجود می‌شود.</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 3</p>
<p>Liskov Substitution Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p></p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 4</p>
<p>Interface Segregation Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>کلاس‌های OnlineOrderService و OnSiteOrderService و PhoneOrderService از واسط به نام OrderService استفاده می‌کنند و هر کدام توابعی را پیاده سازی می‌کنند که از آنها استفاده نمی‌کنند. برای مثال کلاس PhoneOrderService باید توابع onSiteOrderRegister و onlineOrderPayment را پیاده سازی کند در حالی که استفاده‌ای از آنها نمی‌کند.
<br/>
<br/>
در کلاس OnSiteOrderService توابع onlineOrderRegister و phoneOrderRegister و onlineOrderPayment و phoneOrderPayment پیاده سازی شده است که استفاده‌ای از آنها نمی‌کند.
<br/>
<br/>
در کلاس PhoneOrderService توابع onlineOrderRegister و onSiteOrderRegister و onlineOrderPayment و onSiteOrderPayment پیاده سازی شده است که استفاده‌ای از آنها نمی‌کند.
<br/>
<br/>
در کلاس OnlineOrderService توابع onSiteOrderRegister و phoneOrderRegister و onSiteOrderPayment و phoneOrderPayment پیاده سازی شده است که استفاده‌ای از آنها نمی‌کند.
</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 5</p>
<p>Dependency Inversion Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>کلاس‌ها باید از طریق abstraction به یکدیگر وابسته باشند نه به صورت مستقیم و از طریق concretion. اما در اینجا کلاس Main برای ارسال پیام به طور مستقیم با توابع مربوط به سرویس‌ها کار می‌کند به جای اینکه از واسط MessageService استفاده کند.</p>
</td>
</tr>
</tbody>
</table>